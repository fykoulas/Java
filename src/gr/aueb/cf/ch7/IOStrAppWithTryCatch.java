package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOStrAppWithTryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        try {
            System.out.println("Please insert 2 strings: ");
            s1 = in.next(); // Reads up to the first whitespace
            in.nextLine();  // Consume the remaining newline
            s2 = in.nextLine(); // Reads until a newline

            System.out.printf("s1: %s\n", s1);
            System.out.printf("s2: %s\n", s2);
        } catch (Exception e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        } finally {
            in.close(); // Always close the Scanner to free resources
        }
    }
}
