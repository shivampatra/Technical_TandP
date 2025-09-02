import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class CMP{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String[] str = (br.readLine().split(" "));  
        String str = br.readLine();StringTokenizer st = new StringTokenizer(str, ",");
        int catA = Integer.parseInt(st.nextToken());
        int catB = Integer.parseInt(st.nextToken());
        int mouse = Integer.parseInt(st.nextToken());
        int d1,d2,d3;    
        if(catA<mouse){
            d1=mouse-catA;
        }
        else{
            d1=catA-mouse;
        }
        if(catB<mouse){
            d2=mouse-catB;
        }
        else{
            d2=catB-mouse;
        }
        if(d1>d2){
    System.out.println("Cat B is the winner!");
    System.out.println("Log: Cat B wins with distance " + d2 + " from the mouse.");
}
else if(d1<d2){
    System.out.println("Cat A is the winner!");
    System.out.println("Log: Cat A wins with distance " + d1 + " from the mouse.");
}
else{
    System.out.println("Mouse is the winner!");
    System.out.println("Log: Mouse wins as both cats are at equal distance.");
}

    }
}
