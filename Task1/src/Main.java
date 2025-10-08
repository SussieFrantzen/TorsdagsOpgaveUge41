//Opgave 1: Try-Catch med ArrayIndexOutOfBoundsException
//Nedenstående kode indeholder en fejl. Kør koden og observer fejlen.

public class Main { // ændre navn fra ArrayFejl til Main

    public static void printTreForsteElementer(String[] array) {
        System.out.println("Første element: " + array[0]);
        System.out.println("Andet element: " + array[1]);
        System.out.println("Tredje element: " + array[2]);
    }

    public static void main(String[] args) {
        String[] navne1 = {"Anna", "Bob", "Clara", "David"};
        String[] navne2 = {"Eva", "Frank"};

        printTreForsteElementer(navne1);
        printTreForsteElementer(navne2);
    }
}

/*
Din opgave:

* Identificer hvad der går galt når metoden kaldes med navne2
       array består af 3 String, der kan printes. Dermed er der ulighed på de to String navne.
       Det vil sige den ikke kan gå det igennem.
       Mulighed kunne se sådan ud:

       public static void main(String[] args) {
        String[] navne1 = {"Anna", "Bob", "Clara"}; // array er kun 3 langt så David bliver ikke printet
        String[] navne2 = {"Eva", "Frank", "David"}; // rykker David ned så listen på array længde passer



* Tilføj try-catch i metoden til at håndtere ArrayIndexOutOfBoundsException

* I catch-blokken skal du printe en brugervenlig fejlbesked.

* Sørg for at programmet fortsætter og kan kalde metoden med begge arrays
Note: Normalt ville vi validere array-længden med array.length før vi tilgår elementer, men i denne opgave skal du øve dig i at bruge try-catch.


 */