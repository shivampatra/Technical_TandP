import java.io.*;
import java.util.*;
class MigratoryBirds {
    public static int migratoryBirds(int[] arr) {
        int[] birdCounts = new int[6];
        for (int bird : arr) {
            birdCounts[bird]++;
        }int maxCount = 0;
        int minBirdId = 0;
        for (int i = 1; i <= 5; i++) {
            if (birdCounts[i] > maxCount) {
                maxCount = birdCounts[i];
                minBirdId = i;
            }}return minBirdId;}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        int n = Integer.parseInt(br.readLine()); // Read the number of sightings
        int[] arr = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
        System.out.println(migratoryBirds(arr));
    }
}
