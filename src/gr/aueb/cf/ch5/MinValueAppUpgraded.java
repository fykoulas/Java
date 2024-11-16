package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ελέγχει σε μία if αν το num1 είναι μικρότερο από το num2,
 * οπότε το min γίνεται num1. Αλλιώς γίνεται num2.
 */
public class MinValueAppUpgraded {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int min = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Insert num1 and num2: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        min = Math.min(num1, num2);

        System.out.printf("The min number is: %d", min);
    }
}
