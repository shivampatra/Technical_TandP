import java.io.*;
import java.util.*;
class subs{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // int n1 = Integer.parseInt(br.readLine());
        System.out.print("English Subscriber : ");
        int arr1[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // int n2 = Integer.parseInt(br.readLine());
        System.out.print("French Subscriber : ");
        int arr2[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int num:arr1){
            set1.add(num);
        }
        for(int num:arr2){
            set2.add(num);
        }

       set2.retainAll(set1);
        for(int num:set2){
            set1.remove(num);
        }

        System.out.println("Only English Subscriber : "+set1);
        System.out.println(set1.size());



        } 
    }
