import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T24hr{


    public static String timeConversion(String str){
        String period =str.substring(str.length()-2);
        String time = str.substring(0,str.length()-2);
        String t[] = time.split(":");
        int hh = Integer.parseInt(t[0]);
        int mm = Integer.parseInt(t[1]);
        int ss = Integer.parseInt(t[2]);

        if(period.equals("AM")){
            if(hh==12){
                hh=0;
            }
        }
        else{
            if(hh!=12){
                hh+=12;
            }
        }
        return String.format("%02d:%02d:%02d",hh,mm,ss);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();//HH:MM:SS(AM/PM)
        System.out.println(timeConversion(str));
        
    }
}