package gr.aueb.cf.ch4;

import java.util.Scanner;

public class CompareApp {
    public static void main(String[] args) {
        char a = '0';
        char b = '0';
        boolean isGreater = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 letters");
        a = in.next().charAt(0);
        b = in.next().charAt(0);

        System.out.println((int) a);
        System.out.println((int) b);

        if (a > b) {
            isGreater = true;
            System.out.println(a + " = greater than " + b);
        } else System.out.println(a + " = smaller than " + b);

    }
}
