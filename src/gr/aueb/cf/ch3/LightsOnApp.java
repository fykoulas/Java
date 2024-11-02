package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Βρέχει ρε μαλάκα (true/false); ");
        isRaining = in.nextBoolean();
        System.out.println("Είναι σκοτεινά ρε ηλίθιε (true/false); ");
        isDark = in.nextBoolean();
        System.out.println("Με πόσο τρέχεις; ");
        speed = in.nextInt();

        isRunning = (speed>MAX_SPEED);
        lightsOn = isRaining && (isRunning || isDark);

        System.out.println("Τα φώτα πρέπει να ανάψουν: " + lightsOn);
    }
}
