import java.util.*;
import java.io.*;
public class SpaceStationDistance{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); //No of cities ans space station
        String s[] = str.split(" ");
        int n = Integer.parseInt(s[0]);//No of cities --> 5
        int m = Integer.parseInt(s[1]);//No of space station --> 2
        String sp_st = br.readLine();
        String sp[] = sp_st.split(" ");
        int sp_st_cities[]= new int[m];
        for(int i=0;i<s.length;i++){
            sp_st_cities[i]=Integer.parseInt(sp[i]);// 0 4
        }
        System.out.println(flatLandSpaceStation(n,m,sp_st_cities));
    }

    public static int flatLandSpaceStation(int n,int m,int sp_st_cities[]){
        Arrays.sort(sp_st_cities);
        int max_dis = 0;
        max_dis= Math.max(max_dis,sp_st_cities[0]);
        for(int i=1;i<m;i++){
            max_dis=Math.max(max_dis,(sp_st_cities[i]-sp_st_cities[i-1])/2);
        }
        max_dis = Math.max(max_dis,n-1-sp_st_cities[m-1]);
        return max_dis;
    }
}