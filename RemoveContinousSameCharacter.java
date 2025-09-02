import java.io.*;
import java.lang.reflect.Array;
class RCSC{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];```java
for(int i=0;i<n;i++){
    System.out.println(str[i]);
    int cnt = 0;
    for(int j=1;j<str[i].length();j++){
        if(str[i].charAt(j) == str[i].charAt(j-1)){
            cnt++;
        }
    }
    System.out.println(cnt);
}

        for(int i=0;i<n;i++){
           str[i] = br.readLine();
        }

        
        for(int i=0;i<n;i++){
            System.out.println(str[i]);
            String se[] = str[i].split(""); 
            int cnt = 0;
            for(int j=1;j<str[i].length();j++){
                // System.out.println(se[j]);;
                if(se[j].equals(str[j-1])){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        
    }
}