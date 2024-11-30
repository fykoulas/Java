package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SeparatingDigitsApp {
    public static void main(String[] args) {
        int DigitsNumber = 0;
        int num;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        DigitsNumber = in.nextInt();
        String DigitsString = String.valueOf(DigitsNumber);

        for (int i = 0; i < DigitsString.length(); i++) {
            System.out.print(DigitsString.charAt(i));

            if (i < DigitsString.length() - 1) {
                System.out.print(" "); // Add comma between digits
            }


    }
}}