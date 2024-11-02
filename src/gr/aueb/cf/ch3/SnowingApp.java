package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Παρακαλώ ενημερώστε το σύστημα αν βρέχει (true/false): ");
        isRaining = in.nextBoolean();
        System.out.println("Παρακαλώ δώστε την τρέχουσα εξωτερική θερμοκρασία: ");
        temp = in.nextInt();

        isSnowing = isRaining && (temp<0);

        System.out.println("Μήπως χιονίζει ρε μαλάκα και δε βλέπεις καλά; " + isSnowing);
    }
}
