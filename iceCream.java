
//Two students have money at index 0 . both buy icecream but different as all money will spend.


import java.io.*;
import java.io.*;
public class iceCream{
    
   public static String iceCreamParlour(String str){
    String[] costs = str.split(" ");
    int money = Integer.parseInt(costs[0]);
    for(int i = 1; i < costs.length; i++){
        for(int j = i + 1; j < costs.length; j++){
            if(Integer.parseInt(costs[i]) + Integer.parseInt(costs[j]) == money){
                return ("index - "+ i +" : "+costs[i] + "\n" +"index - "+j+" : "+ costs[j]);
            }
        }
    }
    return "";
}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(iceCreamParlour(str));
        

       }
}