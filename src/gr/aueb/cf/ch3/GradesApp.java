package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης θα δίνει:
 * 1. τους συνολικούς βαθμούς μαθημάτων και
 * 2. το πλήθος των μαθημάτων
 *
 * Το πρόγραμμα θα υπολογίζει το μέσο όρο και θα βάζει βαθμολογίες (άριστα αν ο μ.ο. είναι πάνω από 9,
 * πολύ καλά αν ο μ.ο. είναι από 7 έως 9, και καλώς αν μ.ο. 5 έως και fail αν ο μ.ο. είναι μικρότερο από 5)
 */
public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks: ");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative");
            System.exit(1);
        }

        System.out.println("Please insert courser count: ");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courser counts must not be negative");
            System.exit(1);
        }

        average = totalMarks / coursesCount;
        if (average>10) {
            System.out.println("The average must be less or equal than 10");
            System.exit(1);
        }
        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very good");
        } else if (average >= 5); {
            System.out.println("Good");
        }
    }
}
