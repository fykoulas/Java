package gr.aueb.cf.ch2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintApp {
    public static void main(String[] args) {
        int day = 8;
        int month = 7;
        int year = 2024;
        int amount = 54844;
        int result = day + month;
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy και HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Η ημερομηνία είναι: " + day + "/" + month + "/" + year);
        System.out.printf("Η ημερομηνία είναι: %02d/%02d/%d", day, month, year);
        System.out.printf(" και το ποσό που απομένει είναι: %,d\n", amount);
        System.out.println("Το άθροισμα των " + day + " και " + month + " είναι " + result);
        System.out.printf("Το άθροισμα των %d και %d είναι %d\n", day, month, result);
        System.out.println("Η τρέχουσα ημερομηνία και ώρα είναι : " + formattedDateTime);

    }
}
