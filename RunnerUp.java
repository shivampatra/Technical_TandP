import java.io.*;
import java.util.*;
class Runner{

    public static int runnerUp(int arr[]){
        int max=0;
        List<Integer> li = new ArrayList<>();
        for(int num:arr){
            li.add(num);
            if(max<num){
                max=num;
            }
        }
        max=0;
        li.remove(max);
        for(int num:li){
            if(max<num){
                max=num;
            }
        }
    
        return max;
       
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //  int n = Integer.parseInt(br.readLine());
         int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
         System.out.println(runnerUp(arr));
    }
}