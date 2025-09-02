import java.io.*;
class classesDependsOnStudentsNumbers{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String n = (str.substring(str.indexOf('n')+1,str.indexOf(',')));
       
        System.out.println(n);
    }
}