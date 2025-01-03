package CodeWars;

/*
Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
 */

import java.util.Random;

public class Flowers {
    public static void main(String[] args) {

        Random random = new Random();

        int petalsSarah = random.nextInt(100);
        System.out.println("Sarah has picked a flower with " + petalsSarah + " petals");

        int petalsTimmy = random.nextInt(100);
        System.out.println("Timmy has picked a flower with " + petalsTimmy + " petals");

        boolean inLove = (petalsTimmy % 2 == 0 && petalsSarah % 2 == 1) || ((petalsTimmy % 2 == 1 && petalsSarah % 2 == 0));

        if (inLove) {
            System.out.println("Timmy and Sarah are in love");
        } else {
        System.out.println("Timmy and Sarah are not in love");
        }
    }
}