package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει έναν διψήφιο ακέραιο και να εκτυπώνει το άθροισμα των ψηφίων του.
 */
public class DigitsSum {
    public static void main(String[] args) {
        // Μεταβλητές και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int number = 0;
        int digitLeft = 0;
        int digitRight = 0;
        int sum = 0;

        //Εισαγωγή από τον χρήστη
        System.out.println("Δώστε τον διψήφιο αριθμό: ");
        number = in.nextInt();
        digitLeft = number / 10;
        digitRight = number % 10;
        sum = digitLeft + digitRight;
        //Εκτύπωση
        System.out.printf("Το άθροισμα είναι: %d", sum);
    }
}
