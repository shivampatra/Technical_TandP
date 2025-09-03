import java.io.*;
import java.util.*;
public class stackExample{
    public static int isBalance(String exp){
            Stack <Character> st = new Stack<>();
         

            char top ;

            for(char ch:exp.toCharArray()){
            
                if( ch=='{' || ch=='[' || ch=='('){
                    st.push(ch);
                }
            
                else if(ch=='}' || ch==']' || ch==')'){
                    if(st.isEmpty()){
                        return 0;
                    }
                    
                    top = st.pop();

                    if((top=='{' && ch=='}') || (top=='[' && ch==']') || (top=='(' && ch==')')){   
                    }
                    else{
                        return 0;
                    }
                }
            }
           
            if(st.isEmpty()){
                return 1;
            }
            return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();
        int res = isBalance(expression);
        // System.out.println(res);
        if(res==1){
            System.out.println("Expression is valid");
        }
        else{
            System.out.println("Expression is not valid");
        }
    }
}