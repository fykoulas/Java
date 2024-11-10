package gr.aueb.cf.ch4;

/**
 * Print chars
 */
public class CharPrintApp {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = '8';
        System.out.printf("char: %c, Ordinal: %d%n", ch2, (int) ch2);
        System.out.println("char: " + ch1 + ", Ordinal: " + (int) ch1);
        System.out.println("char: " + ch2 + ", Ordinal: " + (int) ch2);
        System.out.printf("char: %c, Ordinal: %d\n", ch2, (int) ch2);
    }
}
