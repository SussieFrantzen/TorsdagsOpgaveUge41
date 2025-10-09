import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

    public String readFile(String filnavn) throws FileNotFoundException {
        File file = new File("src/" + filnavn + ".txt"); // henter fil
        String readFil = null;
        try {
            Scanner scanFile = new Scanner(file); // Opret Scanner med File

            while (scanFile.hasNext()) { // læser så længe der er flere
                readFil = scanFile.nextLine(); // read file.txt
                System.out.println(readFil); // give output

            }
            scanFile.close();// lukker scanner

        } catch (FileNotFoundException e) {
            System.out.println("Sorry the wanted file.txt not exist under this name");

        }
        return readFil;
    }

}