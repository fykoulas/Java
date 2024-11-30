package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SeparatingDigitsAppWithArraysAndModulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputNumber = in.nextInt();

        // Calculate the number of digits
        int temp = Math.abs(inputNumber);
        int digitCount = 0;

        System.out.println("begin temp is " + temp);
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }
        System.out.println("end temp is " + temp);
        System.out.println("Διαιρέσαμε δια 10: " + digitCount + " φορές.");
        System.out.println("Τα ψηφία είναι: " + digitCount + " άρα θα φτιάξουμε πίνακα τέτοιου μήκους.");

        // Create array with correct size
        int[] digits = new int[digitCount];

        // Reset temp to original number
        temp = Math.abs(inputNumber);

        // Extract digits from right to left
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Print digits (now in correct order)
        System.out.println("Digits in the array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        in.close();
    }
}