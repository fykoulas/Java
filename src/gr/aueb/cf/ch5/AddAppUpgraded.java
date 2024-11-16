package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα 2 ακεραίων με τη χρήση μεθόδων.
 */
public class AddAppUpgraded {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert 2 integers for addition and subtraction");
        a = in.nextInt();
        b = in.nextInt();

        sum = add(a, b);
        sub = sub(a, b); // Add.App.sub(a, b);

        System.out.println(sum);
        System.out.println(sub);
    }

    public static int add(int x, int y){
//      int result = 0;
//      result = a + b;
//      return result;
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

}
