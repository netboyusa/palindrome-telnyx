package telnyx.src.telnyxPalindrome;

import java.io.*;
import java.util.List;

/**
 * Created by oscar.rivera on 11/13/17.
 */
public class PalindromeMain {

    public static void main(String[] args) throws FileNotFoundException {
        int numToBeConverted;
        List<Integer> numBase;

        Palindrome palNum = new Palindrome();

        try {
        		// Adding the header into the file output.csv
            String heading = "\"decimal\", \"smallest base in which the number is a palindrome\"";
            File file = new File("src/output.csv");
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(heading);
            pw.flush();
            pw.close();

            // We can use x<=1000 only, but I want to make sure the number is positive everytime.
            for (int x = 1; x <= 1000 && x > 0; x++) {
                System.out.print(x + "\t");
                for (int y = 2; y <= x + 2; y++) {
                    // "y" will be the base number (starting with 2)
                    Base baseNumVal = new Base(y);
                    // We need to convert integer x to "y" base
                    baseNumVal.toBase(x);
                    // We need to get the reverse of the new number
                    numBase = baseNumVal.reverseNumber();
                    // Convert the number to integer
                    numToBeConverted = baseNumVal.toInteger(numBase);

                    if (palNum.verifyIfPalindromeNumber(numToBeConverted) == true) {
                        System.out.println(y);
                        saveRecord(x, y, "src/output.csv");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Cannot create the csv file!");
        }
    }
    // Export the output to a CSV file
    // The file created has the header already (added above)
    public static void saveRecord(int x, int y, String path) {
        try {

            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(x + "," + y);
            pw.flush();
            pw.close();

        } catch (Exception e) {
        		System.out.println("Cannot add the decimal and base numbers into the csv file");
        }
    }
}
