import java.io.*;
import java.util.StringTokenizer;
class ChainMarketing{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter Name :");
        String parent = br.readLine();
        String Yes_No = br.readLine();


        //WHEN WE COMPARISION BETWEEN TWO STRING , WE ARE USING .EQUALS() OR .TOCOMPARE()... ,, WE NEVER USED " == " .BECAUSE IF WE USE THEN THE JVM COMPARES THE REFERENCE OF THOSE TWO STRINGS NOT COMPAR THEIR VALUES. 
        // if(Yes_No =="No"){
        if(Yes_No.equals("No")){
            int total_members=1;
            System.out.println("Total Members: "+total_members);
            System.out.println("Commision Details: \n\t"+parent+": 250INR");
        }
        // else if(Yes_No == "Yes"){
        if(Yes_No.equals("Yes")){
        String Children = br.readLine();
        String Child[] = Children.split(",");
        int total_members = Child.length+1;
        System.out.println("Total Member :" +total_members);
        System.out.println("Commision Details : ");
        int total_commision = total_members*500;
        System.out.println(" Total commission: "+total_commision);
        for(int i=0;i<total_members;i++){
            System.out.println(Child[i] +": 250INR");
        }

       

        }


    }
}