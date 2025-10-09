/*  Opgave 2: NumberFormatException med Integer.parseInt
    Lav et program der beder brugeren om at indtaste tal fra konsollen:
    Brug Integer.parseInt til at konvertere input til int
    Beregn brugerens alder (antag at nuværende år er 2025)
    Print ald
    /* Din opgave:
* Implementer programmet med try-catch til at håndtere NumberFormatException
* Hvis brugeren indtaster noget der ikke er et tal, skal programmet give en fejlbesked
  og bede om input igen
* Programmet skal fortsætte indtil brugeren indtaster et gyldigt år
* Test med både gyldige tal (f.eks. "1995") og ugyldigt input (f.eks. "abc", "19.95")
 */
import java.util.Scanner;
public class Main { // ændre navn fra TalFraBruger til main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                    System.out.println("Indtast dit fødselsår:");
                    String input = scanner.nextLine();
                    int birthyear = Integer.parseInt(input); // convent
                    int thisYear = 2025;
                    int yourAge = thisYear - birthyear;
                    System.out.println("your age in this year is" + yourAge);
                    break; // end if the input was correct.
                }
            catch (NumberFormatException e) {
                  System.out.println("arrow please use integer");
                }

        }
    }

}
