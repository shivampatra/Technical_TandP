// Anirudh is attending an astronomy lecture .His professor who is very strict asks students to write a program to print the trapezium pattern using stars and dots as shown below . Since Anirudh is not good in astronomy can you help him.

// Sample Input: N=3
// Output :
// **.**
// *...*
// .....
// *...* 
// **.**

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrapeziumPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        int totalLines = 2 * N - 1;
        for (int i = 0; i < totalLines; i++) {
            StringBuilder line = new StringBuilder();
            if (i == N - 1) {
                // Middle line: all dots
                for (int j=0;j<2*N-1;j++) {
                    line.append('.');
                }
            } else {
                int currentLine;
                if (i < N - 1) {
                    currentLine = i;
                } else {
                    currentLine = 2 * N - 2 - i;
                }
                int leftStars = N - 1 - currentLine;
                int middleDots = 2 * currentLine + 1;
                int rightStars = leftStars;
                for (int j = 0; j < leftStars; j++) {
                    line.append('*');
                }
                for (int j = 0; j < middleDots; j++) {
                    line.append('.');
                }
                // Append right stars
                for (int j = 0; j < rightStars; j++) {
                    line.append('*');
                }
            }
            System.out.println(line.toString());
        }
    }
}

