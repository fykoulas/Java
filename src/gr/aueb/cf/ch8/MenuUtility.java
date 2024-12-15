package gr.aueb.cf.ch8;

import java.util.Scanner;

public class MenuUtility {
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
    public static int getChoice(Scanner scanner) {
        int choice;

        while (true) {
            try {
                // Ελέγχουμε αν η επόμενη είσοδος είναι ακέραιος
                if (!scanner.hasNextInt()) {
                    // Καθαρίζουμε την εσφαλμένη είσοδο
                    scanner.next();
                    throw new IllegalArgumentException("Μη έγκυρη είσοδος. Αναμενόταν ακέραιος αριθμός.");
                }

                // Διαβάζουμε την επιλογή
                choice = scanner.nextInt();

                // Αν η επιλογή δεν είναι μεταξύ 1 και 5, δημιουργούμε εξαίρεση
                if (choice < 1 || choice > 5) {
                    throw new IllegalArgumentException("Η επιλογή πρέπει να είναι μεταξύ 1 και 5.");
                }

                return choice;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Παρακαλώ εισάγετε έγκυρη επιλογή.");
            }
        }
    }

    // Παράδειγμα χρήσης της κλάσης
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                printMenu();
                int choice = getChoice(scanner);

                switch (choice) {
                    case 1:
                        System.out.println("Επιλέξατε την Επιλογή 1");
                        break;
                    case 2:
                        System.out.println("Επιλέξατε την Επιλογή 2");
                        break;
                    case 3:
                        System.out.println("Επιλέξατε την Επιλογή 3");
                        break;
                    case 4:
                        System.out.println("Επιλέξατε την Επιλογή 4");
                        break;
                    case 5:
                        System.out.println("Έξοδος από το πρόγραμμα");
                        return;
                }
            }
        }
    }
}