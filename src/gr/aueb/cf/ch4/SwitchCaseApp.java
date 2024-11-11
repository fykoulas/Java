package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo of switch/case
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose one of the following: ");
            System.out.println("1. One Player game ");
            System.out.println("2. Two Player game ");
            System.out.println("3. Team Player game ");
            System.out.println("4. Quit ");

        } while (choice != 4);
    }
}
