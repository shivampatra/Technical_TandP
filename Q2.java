// Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two element in A[] whose sum is exactly x.

//Examples:
// Input: arr[]={0,-1,2,-3,1},x=-2
//output : Yes
//Explanation : If we calculate the sum of the output ,1+(-3)= -2

import java.io.*;
public class Q2 {
    public static boolean Sum(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String tkns[] = str.split(",");
        int x = Integer.parseInt(tkns[tkns.length - 1]);
        int arr[] = new int[tkns.length - 1];
        for (int i=0;i<tkns.length-1;i++) {
            arr[i]=Integer.parseInt(tkns[i]);
        }
            if (Sum(arr, x)) {
                System.out.println("Yes");
            } 
            else {
                System.out.println("No");
            }
    }
}