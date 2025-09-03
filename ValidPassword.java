import java.io.*;
class ValidPasssword{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); 
        char ch[] = str.toCharArray();
        boolean track = false;boolean digi = false;boolean uc =false;
        int n = str.length();
        if(n<4){
            track = false;
        }
        if(Character.isDigit(ch[0])){
            track=false;
        }
        for(char s:ch){
            if(Character.isDigit(s)){
                digi = true;
            }
            else if(Character.isUpperCase(s)){
                uc = true;
            }
        }
        System.out.println(track && digi && uc);
    }
}