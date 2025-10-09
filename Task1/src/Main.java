
// Sørg for at programmet fortsætter og kan kalde metoden med begge arrays
public class Main {

        public static void main(String[] args) {
            String[] navne1 = {"Anna", "Bob", "Clara", "David"};
            String[] navne2 = {"Eva", "Frank"};

            ArrayFejl.printTreForsteElementer(navne1);
            ArrayFejl.printTreForsteElementer(navne2);
        }
}
