package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρέπει ημέρες, ώρες, λεπτά και δευτερόλεπτα σε συνολικά δευτερόλεπτα
 */
public class DateTimeToSecondsConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;


        //Εκτύπωση
        System.out.println("Πρόγραμμα Μετατροπής από ημέρες, ώρες, λεπτά και δευτερόλεπτα σε συνολικά δευτερόλεπτα");
        System.out.println("Δώστε τις ημέρες");
        days = in.nextInt();
        System.out.println("Δώστε τις ώρες");
        hours = in.nextInt();
        System.out.println("Δώστε τα λεπτά");
        minutes = in.nextInt();
        System.out.println("Δώστε τα δευτερόλεπτα");
        seconds = in.nextInt();

        int result = (days * 86400) + (hours * 360) + (minutes * 60) + (seconds);

        System.out.printf("Τα συνολικά δευτερόλεπτα είναι: %,d", result);
    }
}
