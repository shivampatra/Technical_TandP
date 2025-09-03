import streamlit as st
import sqlite3

conn = sqlite3.connect('example.db')
c = conn.cursor()

c.execute('''
          CREATE TABLE IF NOT EXISTS trans
          (id INTEGER PRIMARY KEY AUTOINCREMENT,
          num1 INTEGER NOT NULL,
          num2 INTEGER NOT NULL,
          result INTEGER NOT NULL
          );
          ''')
conn.commit()
conn.close()


st.title("Hello")
num1 = st.number_input("Enter your num1: ")
num2 = st.number_input("Enter your num2: ")
result = num1 + num2
if st.button("Add me"):
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute('INSERT INTO trans (num1, num2, result) VALUES (?, ?, ?)',
                   (num1, num2, result))
    conn.commit()
    conn.close()
    st.title(f"result, {result}")


query = "select * from trans"
conn = sqlite3.connect('example.db')
cursor = conn.cursor()
cursor.execute(query)

data = cursor.fetchall()
conn.commit()
conn.close()
st.table(data)


