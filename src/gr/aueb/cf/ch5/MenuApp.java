package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();
        } while (choice !=5);
    }

    public static void printMenu() {
        System.out.println("Choose one of the following: ");
        System.out.println("1. Intro");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Exit");
    }

}
