package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstExerciseExceptions {
    public static void main(String[] args) {
        try {
            // Εμφάνιση του μενού και ανάγνωση της επιλογής
            printMenu();
            int choice = getChoice();
            System.out.println("Επιλέξατε την επιλογή: " + choice);
        } catch (IllegalArgumentException e) {
            // Επεξεργασία της εξαίρεσης αν η επιλογή δεν είναι έγκυρη
            System.out.println("Σφάλμα: Μη έγκυρη επιλογή. Παρακαλώ επιλέξτε έναν αριθμό μεταξύ 1 και 5.");
        }
        }

    }

    // Μέθοδος που εμφανίζει το μενού επιλογών
    public static void printMenu() {
        System.out.println("----- Μενού Επιλογών -----");
        System.out.println("1. Επιλογή 1");
        System.out.println("2. Επιλογή 2");
        System.out.println("3. Επιλογή 3");
        System.out.println("4. Επιλογή 4");
        System.out.println("5. Έξοδος");
        System.out.println("-------------------------");
    }

    // Μέθοδος που διαβάζει την επιλογή του χρήστη με έλεγχο
    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Ελέγχουμε αν η επόμενη είσοδος είναι ακέραιος
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Μη έγκυρη είσοδος. Αναμενόταν ακέραιος αριθμός.");
        }

        // Διαβάζουμε την επιλογή
        choice = scanner.nextInt();

        // Αν η επιλογή δεν είναι μεταξύ 1 και 5, δημιουργούμε εξαίρεση
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Η επιλογή πρέπει να είναι μεταξύ 1 και 5.");
        }

        return choice;
    }
}
