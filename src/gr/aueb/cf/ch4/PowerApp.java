package gr.aueb.cf.ch4;

/**
 * calculates the power of a^n
 */
public class PowerApp {
    public static void main(String[] args) {

        int base = 3;
        int power = 10;
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * base; // result *= base
        }

        System.out.println("Result: " + result);
    }
}
