//Opgave 1: Try-Catch med ArrayIndexOutOfBoundsException
//Nedenstående kode indeholder en fejl. Kør koden og observer fejlen.
public class ArrayFejl {
// har opdelt så main og ArrayFejl fik hver deres
    public static void printTreForsteElementer(String[] array) {

       // Tilføj try-catch i metoden til at håndtere ArrayIndexOutOfBoundsException
        try {
            System.out.println("Første element: " + array[0]);
            System.out.println("Andet element: " + array[1]);
            System.out.println("Tredje element: " + array[2]);
       // I catch-blokken skal du printe en brugervenlig fejlbesked.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" arrow this element had not the correct numbers of names ");
        }
    }
}
/*
Din opgave:

* Identificer hvad der går galt når metoden kaldes med navne2
    der printes 3 navne dermed hvis der ikke er nok navne kan den ikke printe 3.
    den første navne-array havde 4 navne så der var nok indhold til at blive læst.

* Tilføj try-catch i metoden til at håndtere ArrayIndexOutOfBoundsException

* I catch-blokken skal du printe en brugervenlig fejlbesked.

* Sørg for at programmet fortsætter og kan kalde metoden med begge arrays

Note: Normalt ville vi validere array-længden med array.length før vi tilgår elementer, men i denne opgave skal du øve dig i at bruge try-catch.
*/