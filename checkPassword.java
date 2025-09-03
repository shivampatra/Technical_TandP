import java.io.*;
import java.nio.charset.CharacterCodingException;
class CheckPassword{

    public static boolean isValid(String str){
        int l= str.length();
        boolean a = false;
        boolean alp = false;
        boolean digit = false;

        char fn = str.charAt(0);
        if(Character.isDigit(fn)){
            System.out.println("Don't use number in 1st position.");
            return a;
        }
        else if(l<4){
            System.out.println("Atleast use 4 characters");
            return a;
        }
    
        for(int i=0;i<l;i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                digit=true;
            }
            else if(Character.isUpperCase(ch)){
            alp = true;
            }
            else if(ch==' '){
                System.out.println("Remove blank space : "+ch);
                return a;
            }
           else if(ch=='/'){
            System.out.println("remove slash '/' : "+ch);
                return a;
        }
           if(digit && alp){
            return digit && alp;
           }
           else{
                System.out.println("no digit and capital letters are there");
                return a;
           }
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your password :");
        String str = br.readLine();

        if(isValid(str)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    
    }
}




