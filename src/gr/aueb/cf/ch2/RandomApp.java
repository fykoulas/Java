package gr.aueb.cf.ch2;

import java.util.Random;

/**
 * (pseudo) Random demo, ζάρια
 */
public class RandomApp {
    public static void main(String[] args) {
// να δω λίγο πάλι τι υπολογίζει η Math.random
        int die1 =  (int)(Math.random() * 6) + 1;
        int die2 =  (int)(Math.random() * 6) + 1;
        System.out.println("Η ζαριά που έριξες είναι: " + die1 + " και " + die2);
    }
}
