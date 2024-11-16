package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτελεί 10 επαναλήψεις με for.
 */
public class For10AppUpgraded {

    public static void main(String[] args) {
        int x = 0;
        int counter = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        x = in.nextInt();

        for (int i = 1; i <= x; i++, counter++)  {
            System.out.print(i + " ");

            if (counter % 10 == 0) {
                System.out.println();
            }
        }
    }
}