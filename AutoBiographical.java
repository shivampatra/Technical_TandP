import java.io.*;
class ab{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt=0,n=0;
        for(int i=0;i<str.length();i++){
        //    char a = str.charAt(i);
           for(int j=0;j<str.length();j++){
            if(str.charAt(j)==i){
                n++;
            }
           }
        }
        System.out.println(cnt);

    }
}