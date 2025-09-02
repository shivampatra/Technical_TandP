import java.io.*;
import java.util.*;
public class MinFinancialLoss {
    public static int minimumLoss(int[] prices) {
        int n = prices.length;
        Map<Integer, Integer> priceIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            priceIndexMap.put(prices[i], i);
        }Arrays.sort(prices);
        int minLoss = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int loss = prices[i] - prices[i - 1];
            if (priceIndexMap.get(prices[i]) < priceIndexMap.get(prices[i - 1])) {
                minLoss = Math.min(minLoss, loss);
            }}return minLoss;}
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
        int[] prices = Arrays.stream(reader.readLine().trim().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
        System.out.println(minimumLoss(prices));
    }
}
