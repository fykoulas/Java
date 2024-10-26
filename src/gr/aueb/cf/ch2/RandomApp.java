package gr.aueb.cf.ch2;

import java.util.Random;

/**
 * (pseudo) Random demo, ζάρια
 */
public class RandomApp {
    public static void main(String[] args) {
// να δω λίγο πάλι τι υπολογίζει η Math.random
        int die =  (int)(Math.random() * 6) + 1;
        System.out.println(die);
    }
}
