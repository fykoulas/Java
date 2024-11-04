package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please provide a number (100 for quit)");

        while ((num = in.nextInt())!=100) { //συντόμευση (δες SentinelApp)
            iterations++;
            System.out.println("Please provide a number (100 for quit)");
        }

        System.out.printf("You have %d iterations excluding the last one", iterations);
    }

}
