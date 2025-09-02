import java.io.*;
import java.util.*; //String Tokenizer
class OperationChoices{
    
    
    // public static int Operation(int a,int b,int c){
    //     if(c==1){
    //         return a+b;
    //     }
    //     else if(c==2){
    //         return a-b;
    //     }
    //     else if(c==3){
    //         return a*b;
    //     }
    //     else if(c==4){
    //         return a/b;
    //     }
    //     else{
    //         return 0;
    //     }
    // }
    public static void main(String args[]) throws IOException{

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.print("C:");
        // int c = Integer.parseInt(br.readLine());
        // System.out.print("A:");
        // int a = Integer.parseInt(br.readLine());
        // System.out.print("B:");
        // int b = Integer.parseInt(br.readLine());
        // System.out.print(Operation(a,b,c));
        
        
        //Taling input in a same line
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str[] = br.readLine().split(" ");
        // int c =Integer.parseInt(str[0]);
        // int a =Integer.parseInt(str[1]);
        // int b =Integer.parseInt(str[2]);

        //PASSING ARGUMENTS IN COMMAND LINE INTERFACE
        // int c =Integer.parseInt(args[0]);
        // int a =Integer.parseInt(args[1]);
        // int b =Integer.parseInt(args[2]);

        //Using String Tokenizer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        StringTokenizer st = new StringTokenizer(str,",");
        int c = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        switch (c) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid choice");
                // break;
        }

        
    }
}