package CodeWars;

import java.util.Scanner;

public class CockroachSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speedKmPerHour = 0.0;
        int speedCmPerSec = 0;

        System.out.println("Give me the speed of cockroach in km/hour: ");
        speedKmPerHour = scanner.nextDouble();

        System.out.println("The speed of cockroach in cm/sec is: " + cockroachSpeed(speedKmPerHour));
    }

    public static int cockroachSpeed(double x){
        return (int)(x * 27.7778);
    }

}
