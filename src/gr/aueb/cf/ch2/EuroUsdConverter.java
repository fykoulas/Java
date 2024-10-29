package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        //Μεταβλητές
        Scanner in = new Scanner(System.in);
        int inputEuros = 0;
        int totalCents = 0;
        int usaDollars =0;
        int usaCents = 0;
        final int RATE = 99;


        //Εκτύπωση
        System.out.println("Πρόγραμμα Μετατροπής Ευρώ σε Δολάρια");
        System.out.println("Δώστε τα Ευρώ που θέλετε να μετατρέψετε: ");
        inputEuros = in.nextInt();

        totalCents = inputEuros * RATE;
        usaDollars = totalCents / 100;
        usaCents = totalCents % 100;

        System.out.printf("%d Ευρώ είναι ίσα με %d Δολάρια και %d Cents", inputEuros, usaDollars, usaCents);

    }
}
