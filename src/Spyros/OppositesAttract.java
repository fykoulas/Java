package Spyros;

import java.util.Random;

public class OppositesAttract {

    public static void main(String[] args) {
        Random random = new Random();
        int flower1;
        int flower2;

        flower1 = random.nextInt(19) + 1;
        System.out.println("Sarah has picked a flower with " + flower1 + " petals");

        flower2 = random.nextInt(19) + 1;
        System.out.println("Timmy has picked a flower with " + flower2 + " petals");

        inLove(flower1,flower2);
    }

    public static boolean inLove(int a, int b) {

        boolean inLove = (b % 2 == 0 && a % 2 == 1) || ((b % 2 == 1 && a % 2 == 0));

        if (inLove) {
            System.out.println("Timmy and Sarah are in love");
        } else {
            System.out.println("Timmy and Sarah are NOT in love");
        }
        return inLove;

    }

}
