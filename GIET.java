// import java.lang.*;
// import java.io.*;
// class GIET{
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int count = 0 ;
//         int temp = n;
//         int sum = 0;
//         while(temp!=0){
//             count++;
//             temp=temp/10;
           
//         }
//         temp = n;
//         while(temp!=0){
//             int last_digit = temp%10;
//             sum = sum+(int)Math.pow(last_digit,count);
//             count--;
//             temp = temp/10;
//         }
//         if(sum==n){
//             System.out.println("This is a disarium number .");
//         }
//         else{
//             System.out.println("This is not a disarium number .");
//         }
//     }
// }
