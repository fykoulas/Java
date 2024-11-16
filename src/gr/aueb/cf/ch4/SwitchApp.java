package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. One-player game");
        System.out.println("2. Two-player game");
        System.out.println("3. Team game");
        System.out.println("4. Quit");
        System.out.println("Παρακαλώ δώστε την επιλογή σας.");

        choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Επιλέξατε One-player game");
                break;
            case 2:
                System.out.println("Επιλέξατε Two-player game");
                break;
            case 3:
                System.out.println("Επιλέξατε Team game");
                break;
            case 4:
                System.out.println("Επιλέξατε Quit");
                break;
            default:
                System.out.println("Έχετε επιλέξει κάτι λάθος.");
        }

    }
}
