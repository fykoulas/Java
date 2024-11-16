package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Show a menu at least once
 */
public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Quit");
            choice = in.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Error in choice. Please try again");
                continue;
            }


            switch (choice) {
                case 1:
                    System.out.println("You selected Insert.");
                    break;
                case 2:
                    System.out.println("You selected Delete");
                    break;
                case 3:
                    System.out.println("You selected Quit.");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        }  while (choice != 3) ;

        System.out.println("Thanks for using the Menu app");
    }
}