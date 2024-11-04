package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Special forms of "while"
 */
public class SpecialWhileTypes {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        int num;

        while ((num = in.nextInt()) >= 0); //απλά διαβάζει, καταναλώνει συνεχώς θετικούς, αγνοώντας τους μέχρι να βρει αρνητικό αριθμό ο οποίος εκχωρείται στη num


        while (i <= 0){
            System.out.println("Never gets in");
            i++;
        }

        while (i < 1) {
            System.out.println("Never gets in");
            i++;
        }

        while (i <= 1) {
            System.out.println("Gets in one time");
            i++;
        }

        while (true) {
            System.out.println("Eternal loop");
        }

    }

}
