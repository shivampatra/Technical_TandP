import java.io.*;
import java.util.*;
class Conversion{

    public static void InfixPostfix(String exp){
        Stack<Character> st = new Stack<>();
        Map<Character,Integer> map = new HashMap<>();
        map.put('(',0);
        map.put('-',1);
        map.put('+',2);
        map.put('%',3);
        map.put('/',4);
        map.put('*',5);
        map.put('^',6);

        char[] res = new char[exp.length()];
        int i =0;
        for(char ch:exp.toCharArray()){
            if(st.isEmpty()){
                if(map.containsKey(ch)){
                    st.push(ch);
                }
                else{
                    res[i] = ch; 
                    i++; 
                }
            }
            // else if(map.containsKey(ch) && map.get(st.peek())<map.get(ch)){

            else if(map.containsKey(ch)){
                    if(map.get(st.peek())<map.get(ch)){
                        st.push(ch);
                    }

                    // else if(map.containsKey(ch) ){
                    
                    // else if(map.containsKey(ch) && map.get(st.peek())>map.get(ch)){
                    // res[i]=st.pop();
                    // i++;
                    // if(map.get(st.peek())>map.get(ch)){
                    //     res[i]=st.pop();
                    //     i++;
                    // }

                        else{
                            while(map.get(st.peek())>map.get(ch)){
                                res[i]=st.pop();
                                i++;
                                if(st.isEmpty()){
                                    break;
                                }
                            }                        
                            st.push(ch);
                    }
                }
            
            else if(ch==')'){
                while(st.peek()!='('){
                    res[i]=st.pop();
                    i++;
                }
                st.pop();
            }
            else{
                res[i] = ch; 
                i++;
            }
        }
        while (st.size()!=0) {
            res[i]=st.pop();
            i++;
        }
        System.out.println(st); 
        System.out.println(res);
      
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        InfixPostfix(exp);
    }
}