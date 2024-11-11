package gr.aueb.cf.ch4;

/**
 * Special types of for
 */
public class SpecialFor {
    public static void main(String[] args) {
        int count = 0;

        for (int =1; i <= 1; i++) {
            System.out.println("Once");
        }

        for (int = 1; j = 10; i < j; i++, j--) {
            System.out.println(i + ", " + j);
        }

        for (;;) {
            System.out.println("for ever");
            count++;
            if (count == 10) break;
        }
    }
}
