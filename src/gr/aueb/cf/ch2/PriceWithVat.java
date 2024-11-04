package gr.aueb.cf.ch2;

/**
 * Calculates the prices with VAT
 */

import java.util.Scanner;

public class PriceWithVat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double VAT = 1.24;
        double price = 0.0;
        double finalPrice = 0.0;
        System.out.println("Give the price: ");
        price = in.nextDouble();

        finalPrice = price * VAT;

        System.out.println("Final price with VAT is: " + finalPrice);
        System.out.printf("Final price with VAT is: %.2f", finalPrice);
    }
}
