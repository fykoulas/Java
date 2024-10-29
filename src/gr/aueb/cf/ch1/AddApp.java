package gr.aueb.cf.ch1;

import java.sql.SQLOutput;

/**
 * Calculates the sum of 2 integers
 * and the result is printed at console
 * (standard output)
 */

public class AddApp {
    public static void main(String[] args) {
        //Δήλωση και Αρχικοποίηση κάποιων Μεταβλητών (όχι όλων)
        int num1 = 5;
        int num2 = 121;
        int result;
        int result2;
        double result3;

        //Εντολές
        result = num1 + num2;
        result2 = num1 * num2;
        result3 = (double) num2 / num1;

        //Εκτύπωση
        System.out.println("Το αποτέλεσμα είναι: " +result);
        System.out.println("Το άθροισμα των " + num1 + " και " + num2 + " είναι ίσο με: " + result);
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με: %d\n", num1, num2, result);
        System.out.printf("Αν πολλαπλασιάσω το %d με το %d, τότε το αποτέλεσμα θα είναι: %d\n", num1, num2, result2);
        System.out.printf("Αν διαιρέσω το %d δια του %d, τότε το αποτέλεσμα θα είναι: %.2f\n", num2, num1, result3);
    }
}
