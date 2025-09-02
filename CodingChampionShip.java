//Using Array

// import java.util.*;
// import java.io.*;
// class champion{
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//         int max = 0,max1=0;
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             if(max<arr[i]){
//                 max = arr[i];
//             }
//         }
//         int[] arr1=new int[n-1];
//         for(int i=0,j=0;i<n;i++){
//             if(max!=arr[i]){
//                 // System.out.println(arr[i]);
//                 arr1[j] = arr[i];
//                 j++;
//             }
//         }
//         for(int i=0;i<n-1;i++){
//             if(max1<arr1[i]){
//                 max1=arr[i];
//             }
//         }
//         System.out.println(max+" "+max1);
//     }
// }


// Using LinkedList

// import java.io.*;
// import java.util.*;
// class champion{
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         LinkedList<Integer> ll = new LinkedList<>();
//         int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//         for(int num:arr){
//             ll.add(num);
//         }
//         int max=0,cnt=0;
//         while(cnt<2){
//             for(int num:ll){
//                 if(num>max){
//                     max=num;
//                 }
//             }
//         ll.remove(ll.indexOf(max));
//         cnt++;
//         System.out.print(max+" ");
//         max=0;
//         }
//     }
// }


//using stack 

import java.io.*;
import java.util.*;
class champion{
    public static void main(String[] args) throws IOException{
        Stack<Integer> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int top = 0,p=0;

        for(int num:arr){
            if(st.isEmpty()){
                st.push(num);
                top=num;
            }
            else if(top<num){    
                p=st.pop();
                st.push(num);
                top=num;
            }
            else if(p<num){
                p=num;
            }       
        }
        st.push(p);
        System.out.println(st);
    }
}
