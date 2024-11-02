package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1; //επειδή έχουμε πολλαπλασιασμό
        int i = 1;
        char ready = 'N';


        System.out.println("Θα υψώσουμε τον αριθμό a στη δύναμη b! Είσαι έτοιμος (Y/N);");
        String input = in.next();
        ready = input.charAt(0);

        if (ready == 'Y' || ready == 'y') {
            System.out.println("Είσαι έτοιμος!");
        } else if (ready == 'N' || ready == 'n') {
            System.out.println("Δεν είσαι έτοιμος!");
        } else {
            System.out.println("Παρακαλώ πληκτρολογήστε Y ή N.");
        }

        System.out.println("Δώσε μου τον αριθμό a: ");
        a = in.nextInt();
        System.out.println("Δώσε μου τη δύναμη b: ");
        b = in.nextInt();

        while (i <=a) {
            result = result * b;
            i++;

        }

        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
