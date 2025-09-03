import java.io.*;
public class TrapeziumNew{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print(".");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-2;i>=0;i--){
            //3 - 1 0
            for(int j=0;j<n-i-1;j++){
                
                System.out.print("*");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print(".");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");       
         }
         System.out.println();
        }

    }
}