package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demo of ternary operator (conditional assignment)
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int abs = 0;

        System.out.println("Please enter a num");
        num = scanner.nextInt();

//        if (num>=0) abs = num;
//        else abs = -num;
          abs = (num>= 0) ? num : -num; // condition ? value_if_true : value_if_false;

        System.out.println("The absolute number is: " + abs);
    }
}
