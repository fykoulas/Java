package gr.aueb.cf.ch3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Calculates n!
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert your number: ");
        num = in.nextInt();

        while (i <=num) {
            facto *= i;
            i++;
        }

        System.out.println("Factorial: " + facto);

    }
}
