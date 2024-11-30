package gr.aueb.cf.ch1;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = 0;
        int diameter = 0;
        double circumference = 0;
        double area = 0;

        System.out.print("Enter radius: ");
        radius = in.nextInt();

        System.out.printf("Diameter: %d\n", (radius * 2));
        System.out.printf("Circumference: %.2f\n", (2 * Math.PI * radius));
        System.out.printf("Area: %.2f", Math.PI * radius * radius);

    }
}
