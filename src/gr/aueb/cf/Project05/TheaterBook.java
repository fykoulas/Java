package gr.aueb.cf.Project05;

import java.util.Scanner;

public class TheaterBook {
    // Θέατρο με 30 σειρές και 12 στήλες
    private boolean[][] seats = new boolean[30][12];

    // Μέθοδος για κράτηση θέσης
    public void book(char column, int row) {
        int colIndex = column - 'A';
        int rowIndex = row - 1;

        if (isValidSeat(colIndex, rowIndex)) {
            if (!seats[rowIndex][colIndex]) {
                seats[rowIndex][colIndex] = true;
                System.out.println("Η θέση " + column + row + " κρατήθηκε με επιτυχία.");
            } else {
                System.out.println("Η θέση " + column + row + " είναι ήδη κρατημένη.");
            }
        } else {
            System.out.println("Μη έγκυρη θέση.");
        }
    }

    // Μέθοδος για ακύρωση κράτησης
    public void cancel(char column, int row) {
        int colIndex = column - 'A';
        int rowIndex = row - 1;

        if (isValidSeat(colIndex, rowIndex)) {
            if (seats[rowIndex][colIndex]) {
                seats[rowIndex][colIndex] = false;
                System.out.println("Η κράτηση της θέσης " + column + row + " ακυρώθηκε με επιτυχία.");
            } else {
                System.out.println("Η θέση " + column + row + " δεν είναι κρατημένη.");
            }
        } else {
            System.out.println("Μη έγκυρη θέση.");
        }
    }

    // Μέθοδος για έλεγχο αν η θέση είναι κρατημένη
    public boolean isBooked(char column, int row) {
        int colIndex = column - 'A';
        int rowIndex = row - 1;

        if (isValidSeat(colIndex, rowIndex)) {
            return seats[rowIndex][colIndex];
        } else {
            System.out.println("Μη έγκυρη θέση.");
            return false; // Επιστροφή false για μη έγκυρη θέση
        }
    }

    // Βοηθητική μέθοδος για έλεγχο εγκυρότητας θέσης
    private boolean isValidSeat(int colIndex, int rowIndex) {
        if (colIndex < 0 || colIndex >= 12) {
            System.out.println("Μη έγκυρη στήλη: " + colIndex);
            return false;
        }
        if (rowIndex < 0 || rowIndex >= 30) {
            System.out.println("Μη έγκυρη σειρά: " + rowIndex);
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        gr.aueb.cf.Project05.TheaterBook theater = new gr.aueb.cf.Project05.TheaterBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nΕπιλογές:");
            System.out.println("1. Κράτηση θέσης");
            System.out.println("2. Ακύρωση θέσης");
            System.out.println("3. Έλεγχος αν η θέση είναι κρατημένη");
            System.out.println("4. Έξοδος");
            System.out.print("Επιλέξτε: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Έξοδος από το πρόγραμμα.");
                break;
            }

            System.out.print("Δώστε στήλη (A-L): ");
            char column = scanner.next().toUpperCase().charAt(0);
            System.out.print("Δώστε σειρά (1-30): ");
            int row = scanner.nextInt();

            switch (choice) {
                case 1:
                    theater.book(column, row);
                    break;
                case 2:
                    theater.cancel(column, row);
                    break;
                case 3:
                    if (theater.isBooked(column, row)) {
                        System.out.println("Η θέση " + column + row + " είναι κρατημένη.");
                    } else {
                        System.out.println("Η θέση " + column + row + " είναι διαθέσιμη.");
                    }
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή.");
            }
        }

        scanner.close();
    }
}
