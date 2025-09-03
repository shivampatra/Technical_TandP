import java.io.*;
class bitwiseOperator{
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input : ");
        String str = br.readLine();
        int a = Integer.parseInt(String.valueOf(str.charAt(0)));
        
        if(str==null){
            System.out.print("-1");
        }
        else{
        int i = 1;
        // for(int i=0;i<str.length();i++){
        while(i<str.length()){

            char n = str.charAt(i);
            char n1 = str.charAt(i+1);

            // if(n=='C'){
           if(n=='C'){
            a^=Integer.parseInt(String.valueOf(n1));
            }
            if(n=='B'){
                a|=Integer.parseInt(String.valueOf(n1));
            }
            if(n=='A'){
                a&=Integer.parseInt(String.valueOf(n1));
            }
            i+=2;
          }
        System.out.println(a);
        }
    }
}
// 1C0C1C1A0B1