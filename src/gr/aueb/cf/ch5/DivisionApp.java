package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Double demo.
 */
public class DivisionApp {

    public static void main(String[] args) {
        double num1;
        double num2;

        float myFloat = 4.5F;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two doubles");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        System.out.printf("Div: %.2f\n", divCalculate(num1, num2));
        System.out.printf("Mod: %.2f", modCalculate(num1, num2));

    }
    public static double divCalculate(double a, double b) {
        return a / b;
    }

    public static double modCalculate(double x, double y) {
        return x % y;
    }


}

