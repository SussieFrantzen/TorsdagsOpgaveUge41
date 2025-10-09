import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Læs tal fra fil "tal.txt" med Scanner

        /*   DER TJEKKES HER OM FILEN ER DER ELLER EJ // File START                              */

        File file = new File("src/tal.txt"); // import the file
        int[] talArray = new int[5]; // array list max 5 pladser
        int i = 0;
        int number = 0;

        try {
            Scanner fileScanner = new Scanner(file); // kalder scanner der læser filen
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                number = Integer.parseInt(line);
                talArray[i] = number;// her gemmes talene i array.
                i++;
            }
            fileScanner.close();// lukker scanneren

        } catch (FileNotFoundException e) {
            System.out.println("Sorry the wanted file.txt not exist under this name");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("for manny numbers");

        } catch (NumberFormatException e) {
            System.out.println("the file have not only numbers");

        }

    }
}


/*       ------------------------ // File End//  ------------------------------   */


    /*
    System.out.println("check point: this is the numbers in my array: ");
        for (int l = 0; l < i; l++) {
            System.out.

                    println(talArray[l]);



    // Håndter følgende exceptions med separate catch-blokke:

    // - ArrayIndexOutOfBoundsException (hvis filen har for mange tal)
    // - NumberFormatException (hvis filen indeholder ikke-tal)
*/


