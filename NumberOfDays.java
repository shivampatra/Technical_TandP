// import java.io.*;
// class NumberOfDays{
// public static void main(String[] args) throws IOException{
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String str[] = br.readLine().split(" ");
//     int choco = Integer.parseInt(str[0]);
//     int wrap = Integer.parseInt(str[1]);
//     int d=0;
//     while (choco>0) {
//         d+=choco;
//         wrap+=choco;
//         choco=wrap/7;
//         wrap=wrap%7;
//     }
//     System.out.println(d);
    
// }
// }


// //USING ADD LOGS IN EXTENSION
// import java.io.*;
// import java.util.logging.*;
// class NumberOfDays{
//     private static final Logger logger = Logger.getLogger(NumberOfDays.class.getName());
//     public static void main(String[] args) throws IOException{
//         logger.info("Program started");
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         logger.info("Reading input from user");
//         String str[] = br.readLine().split(" ");
//         int choco = Integer.parseInt(str[0]);
//         int wrap = Integer.parseInt(str[1]);
//         logger.info("Chocolates: " + choco + ", Wrappers: " + wrap);
//         int d=0;
//         while (choco>0) {
//             logger.info("Chocolates: " + choco + ", Wrappers: " + wrap);
//             d+=choco;
//             wrap+=choco;
//             choco=wrap/7;
//             wrap=wrap%7;
//         }
//         logger.info("Total days: " + d);
//         System.out.println(d);
//         logger.info("Program ended");
//     }
// }

// //IMPROVE CODE :import java.io.*;
// import java.util.InputMismatchException;
// import java.io.*;
// import java.util.logging.Logger;

// class NumberOfDays {
//     private static final Logger logger = Logger.getLogger(NumberOfDays.class.getName());

//     public static void main(String[] args) {
//         logger.info("Program started");
//         try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//             logger.info("Reading input from user");
//             String[] input = br.readLine().split(" ");
//             if (input.length != 2) {
//                 logger.severe("Invalid input format. Please enter two numbers separated by space.");
//                 return;
//             }
//             try {
//                 int chocolates = Integer.parseInt(input[0]);
//                 int wrappers = Integer.parseInt(input[1]);
//                 if (chocolates <= 0 || wrappers <= 0) {
//                     logger.severe("Both chocolates and wrappers must be positive integers.");
//                     return;
//                 }
//                 logger.info("Chocolates: " + chocolates + ", Wrappers: " + wrappers);
//                 int totalDays = calculateTotalDays(chocolates, wrappers);
//                 logger.info("Total days: " + totalDays);
//                 System.out.println(totalDays);
//             } catch (NumberFormatException e) {
//                 logger.severe("Invalid input. Please enter two integers separated by space.");
//             }
//         } catch (IOException e) {
//             logger.severe("Error reading input: " + e.getMessage());
//         } finally {
//             logger.info("Program ended");
//         }
//     }

//     private static int calculateTotalDays(int chocolates, int wrappers) {
//         int totalDays = 0;
//         while (chocolates > 0) {
//             totalDays += chocolates;
//             wrappers += chocolates;
//             chocolates = wrappers / 7;
//             wrappers = wrappers % 7;
//         }
//         return totalDays;
//     }
// }

// IMPROVE CODE + ADD LOGS :
import java.io.*;
import java.util.InputMismatchException;
import java.io.*;
import java.util.logging.Logger;

class NumberOfDays {
    private static final Logger logger = Logger.getLogger(NumberOfDays.class.getName());

    public static void main(String[] args) {
        logger.info("Program started");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            logger.info("Reading input from user");
            String[] input = br.readLine().split(" ");
            if (input.length != 2) {
                logger.severe("Invalid input format. Please enter two numbers separated by space.");
                return;
            }
            try {
                int chocolates = Integer.parseInt(input[0]);
                int wrappers = Integer.parseInt(input[1]);
                if (chocolates <= 0 || wrappers <= 0) {
                    logger.severe("Both chocolates and wrappers must be positive integers.");
                    return;
                }
                logger.info("Chocolates: " + chocolates + ", Wrappers: " + wrappers);
                int totalDays = calculateTotalDays(chocolates, wrappers);
                logger.info("Total days: " + totalDays);
                System.out.println(totalDays);
            } catch (NumberFormatException e) {
                logger.severe("Invalid input. Please enter two integers separated by space.");
            }
        } catch (IOException e) {
            logger.severe("Error reading input: " + e.getMessage());
        } finally {
            logger.info("Program ended");
        }
    }

    private static int calculateTotalDays(int chocolates, int wrappers) {
        int totalDays = 0;
        while (chocolates > 0) {
            totalDays += chocolates;
            wrappers += chocolates;
            chocolates = wrappers / 7;
            wrappers = wrappers % 7;
        }
        return totalDays;
    }
}