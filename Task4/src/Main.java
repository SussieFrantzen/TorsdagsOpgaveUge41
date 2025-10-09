import java.io.FileNotFoundException;
import java.util.Scanner;

// Kald fileIO.laesFilIndhold() i en try-catch
// Hvis FileNotFoundException: bed om nyt filnavn og prøv igen
// Fortsæt indtil en gyldig fil er læst
// Print filens indhold

public class Main { //FilLaeserProgram
    public static void main(String[] args) {
        boolean keepGoing = true;
        while (keepGoing) {
            try {
                // Bed brugeren om filnavn
                System.out.println("please write your file name");
                Scanner scan = new Scanner(System.in); // user can write a input
                String fileInput = scan.next(); // the input get a variabel
// --------------------------------------////----------------------------------//
                FileIO fileIO = new FileIO();
                fileIO.readFile(fileInput);
                keepGoing = false;
            } catch (FileNotFoundException e) {
                System.out.println("Sorry the wanted file not exist under this name");

            }
        }
    }
}