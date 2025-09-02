import java.io.*;
class gridPattern{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num=1;
        for(int i=1;i<n+1;i++){
            for(int j=0;j<n;j++){
                if((i+j)%2==0){
                    System.out.print(num);
                num++;
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}