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

class button_name:
    def __init__(self, num1, num2, result, id):
        st.subheader(f"id -> {id} => {num1} + {num2} = {result}")
        if st.button("Delete", key=id):
            self.delete(id)


    def delete(self, id):
            conn = sqlite3.connect('example.db')
            cursor = conn.cursor()
            cursor.execute('DELETE FROM trans WHERE id = ?', (id,))
            conn.commit()
            conn.close()
            st.rerun()


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
# st.write(data)

for sublist in data:
    param1, param2, param3, param4 = sublist[0], sublist[1], sublist[2], sublist[3]
    button_name(param2, param3, param4, param1)

