package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * Βρίσκει το πρώτο αριστερά ψηφίο
 * ενός ακεραίου.
 */
public class FirstDigitSpyros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int newNumber = 0;

        System.out.println("Enter a positive number");
        inputNumber = scanner.nextInt();

        newNumber = inputNumber;

        while (newNumber >=10) {
            newNumber = newNumber / 10;
        }

        System.out.println("The first digit of " + inputNumber + " is "  + newNumber);
    }


}