package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TankApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;
        int capacityTank1 =0;
        int capacityTank2 =0;
        final int TOTAL_CAPACITY_TANK1 = 100;
        final int TOTAL_CAPACITY_TANK2 = 150;

        System.out.println("Πόσα λίτρα έχει τώρα η Δεξαμενή 1; ");
        capacityTank1 = in.nextInt();
        isEmptyTank1 = (capacityTank1< (0.25 * TOTAL_CAPACITY_TANK1));
        System.out.println("Η Δεξαμενή 1 έχει λιγότερο από το 1/4, σύντομα θα χρειαστεί γέμισμα; " + isEmptyTank1);

        System.out.println("Πόσα λίτρα έχει τώρα η Δεξαμενή 2; ");
        capacityTank2 = in.nextInt();
        isEmptyTank2 = (capacityTank2< (0.25 * TOTAL_CAPACITY_TANK2));
        System.out.println("Η Δεξαμενή 2 έχει λιγότερο από το 1/4, σύντομα θα χρειαστεί γέμισμα; " + isEmptyTank2);

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("Πορτοκαλί λαμπάκι: " + isOrange + " Κόκκινο λαμπάκι: " + isRed);
    }
}
