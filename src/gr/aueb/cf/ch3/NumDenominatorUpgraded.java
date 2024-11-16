package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominatorUpgraded {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numerator = 0;
        double denominator = 0;
        double result = 0;

        while (true) {
            System.out.println("Please insert numerator (Quit with numerator = 0)");
            numerator = scanner.nextDouble();

            if (numerator == 0) {
                System.out.println("Numerator is zero. Quiting....");
                break;
            }

            System.out.println("Please insert denominator");
            denominator = scanner.nextDouble();

            if (denominator == 0) {
                System.out.println("Denominator must not be zero.");
                continue;
            }

            result = numerator / denominator;
            System.out.printf("%.2f\n", result);
        }
    }
}








//            if (denominator != 0) {
//                if (numerator != 0) {
//                    result = numerator / denominator;
//                } else {
//                    System.out.println("Numerator is zero");
//                    break;
//                }
//            } else {
//                System.out.println("Denominator is zero");
//                continue;
//            }