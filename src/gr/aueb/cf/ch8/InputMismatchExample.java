package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExample extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        try {
            int number = scanner.nextInt(); // Expects an integer
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {

            System.out.println("Error: Please enter a valid integer.");
        }

        scanner.close();
    }
}

