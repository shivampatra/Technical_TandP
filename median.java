import java.io.*;
import java.util.*;

public class median {
    public static int findMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
}    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // Read the size of the array
        int[] arr = Arrays.stream(br.readLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();
        System.out.println(findMedian(arr));
    }
}
