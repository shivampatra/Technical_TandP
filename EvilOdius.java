import java.io.*;


    // BINARY DIGIT OF A NUMBER IN WHICH IF EVEN NUMBER OF 1'S COME THEN IT KNOWN AS EVIL NUMBER OTHERWISE IT IS CALLED ODIUS NUMBER


class EvilOdius{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number to check Evil or Odius : ");
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(num>0){
            int n=num%2;
            System.out.print(n);
            if(n==1){
               cnt++;
            }num /= 2;
        }if(cnt%2==0){
        System.out.println("\nEvil number");
        }else{
            System.out.println("Odius number");
        }
    }
}