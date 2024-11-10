package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DisektoApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isDisekto = false;
        boolean diaireitaiMe100 = false;
        boolean diaireitaiMe400 = false;
        boolean diaireitaiMe4 = false;
        int days = 0;
        int etos = 0;

        System.out.println("Δώστε ένα έτος: ");
        etos = in.nextInt();

        diaireitaiMe100 = (etos % 100 == 0);
        diaireitaiMe400 = (etos % 400 == 0);
        diaireitaiMe4 = (etos % 4 == 0);

        if ((diaireitaiMe4 && !diaireitaiMe100) || (diaireitaiMe400)) {
            isDisekto = true;
        }

        if (isDisekto){
            System.out.println("Το έτος " + etos + " είναι δίσεκτο!");
        } else {
            System.out.println("Το έτος " + etos + " δεν είναι δίσεκτο!");
        }

    }
}
