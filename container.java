// import java.io.*;

// class Container {
//     public static void main(String[] args) throws IOException {
//         try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//             String str = br.readLine();

//             str = str.substring(str.indexOf('[') + 1, str.indexOf(']')); 
//             String inpt[] = str.split(","); 

//             int left = 0, right = inpt.length - 1, mA = 0;
            
//             while (left < right) {
//                 int lHeight = Integer.parseInt(inpt[left]);
//                 int rHeight = Integer.parseInt(inpt[right]);
//                 int mHeight = Math.min(lHeight, rHeight);
//                 mA = Math.max(mA, mHeight * (right - left));
                
//                 if (lHeight < rHeight) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
            
//             System.out.println(mA);
//         }
//     }
// }


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

class Container {
    private static final Logger logger = Logger.getLogger(Container.class.getName());

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            logger.info("Reading input from user...");
            String input = br.readLine();
            logger.info("Input received: " + input);

            input = input.replaceAll("[\\[\\]]", "");
            logger.info("Input after removing brackets: " + input);
            String[] heights = input.split(",");
            logger.info("Heights array: " + java.util.Arrays.toString(heights));

            int maxArea = 0;
            int left = 0;
            int right = heights.length - 1;
            logger.info("Initializing left and right pointers: " + left + ", " + right);

            while (left < right) {
                int leftHeight = Integer.parseInt(heights[left]);
                int rightHeight = Integer.parseInt(heights[right]);
                int minHeight = Math.min(leftHeight, rightHeight);
                maxArea = Math.max(maxArea, minHeight * (right - left));
                logger.info("Current max area: " + maxArea);

                if (leftHeight < rightHeight) {
                    left++;
                } else {
                    right--;
                }
                logger.info("Updated left and right pointers: " + left + ", " + right);
            }

            logger.info("Max area found: " + maxArea);
            System.out.println(maxArea);
        } catch (IOException e) {
            logger.severe("Error reading input: " + e.getMessage());
        }
    }
}