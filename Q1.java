// Write a function that accepts a String 'str' which has a lenght of 'len' , the string consists of alphabets and "#" symbols in it.So the function should print a string which should have same characters as previous string but all the "#" symbols should be moved to front following remaining characters.
// Input : Move#to#front
// Output: ##Movetofront
import java.io.*;
public class Q1 {
    public static void moveHashesToFront(String str, int length) {
        int hashCnt = 0;
        String res = "";
        
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '#') {
                hashCnt++;
            } else {
                res += str.charAt(i);
            }
        }
        
        String fResult = "";
        for (int i = 0; i < hashCnt; i++) {
            fResult += "#";
        }
        fResult += res;
        
        System.out.println(fResult);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        moveHashesToFront(str, str.length());
    }
}

