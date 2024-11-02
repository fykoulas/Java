package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please give me a number (int): ");
        num = in.nextInt();
        while (num >=0) {
            positivesCount++;
            System.out.println("Please give me a number (int): ");
            num = in.nextInt();
        }
        System.out.println("You have entered " + positivesCount + " positive numbers!");
    }
}
