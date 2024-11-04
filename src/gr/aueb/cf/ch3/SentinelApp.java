package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SentinelApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please provide a number (100 for quit)");
        num = in.nextInt();
        while (num !=100) {
            iterations++;
            System.out.println("Please provide a number (100 for quit)");
            num = in.nextInt();
        }
        System.out.printf("You have %d iterations excluding the last one", iterations);
    }
}
