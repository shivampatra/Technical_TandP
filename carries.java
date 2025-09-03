//no of carries during sum of two digit 

import java.io.*;
class carries{



        public static int carriesNumber(int num1,int num2){
            int c=0;
            while(num1!=0||num2!=0){
                int DigitSum = (num1%10)+(num2%10)+c;
                if(DigitSum>9){
                    c++;
                }
                num1/=10;
                num2/=10;
            }       
            return c;
        }



    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Num1:");
        int num1 = Integer.parseInt(br.readLine());
        System.out.print("Num2:");
        int num2 = Integer.parseInt(br.readLine());
        
        
        
        // int carries=0;
        // while (num1>0 || num2>0){
        //     int digitSum=(num1%10)+(num2%10) + carries;
        //     if(digitSum>=10) {
        //         carries++;
        //     }
        //     num1/=10;
        //     num2/=10;
        // }
        // System.out.println(carries);




        System.out.println(carriesNumber(num1, num2));
        
        

    }
}

