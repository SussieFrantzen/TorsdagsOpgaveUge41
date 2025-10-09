// Opgave 3: FileNotFoundException med Try-Catch

/* Lav et program der:
    Beder brugeren om at indtaste et filnavn via Scanner
    Forsøger at læse fra filen med Scanner og File
    Printer filens indhold linje for linje
    Bruger try-catch til at håndtere FileNotFoundException
    Hvis filen ikke findes, skal programmet give en fejlbesked og bede om et nyt filnavn
    Programmet skal fortsætte indtil brugeren indtaster en fil der eksisterer
    Alt skal ske i main metoden
    Opret testfiler:

    findes.txt med nogle linjer tekst
    Test også med filnavne der ikke eksisterer
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true) {
            try {
                System.out.println("please write your file name");
                Scanner scan = new Scanner(System.in); // user can write a input
                String fileInput = scan.next(); // the input get a variabel

                File file = new File("src/"+fileInput+".txt"); // inset the input of the file and Call the file.
                Scanner scanFile = new Scanner(file); // scanner read the file
                while(scanFile.hasNext()) {
                    String readFile = scanFile.nextLine(); // read file
                    System.out.println(readFile); // give output
                }
                break;
            }
            catch (FileNotFoundException e){
                System.out.println("Sorry the wanted file not exist under this name");

            }
        }
    }
}