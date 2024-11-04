package gr.aueb.cf.ch3;
/**
 * Calculate the sum and mul of the first n integers
 */

import java.util.Scanner;

public class Sum10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum1 = 0;
        long mul1 = 1L;
        int i = 1;
        int n = 0;

        System.out.println("Πόσους πρώτους αριθμούς θέλετε να αθροίσω και να πολλαπλασιάσω; ");
        n = in.nextInt();

        while (i <= n) {
            sum1 += i;
            mul1 = mul1 * i; // ή mul1 *= i;
            i++;
        }
        System.out.println("Το άθροισμα των " + n + " πρώτων αριθμών είναι: " + sum1);
        System.out.println("Το γινόμενο των " + n + " πρώτων αριθμών είναι: " + mul1);
    }
}
