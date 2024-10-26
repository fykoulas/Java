package gr.aueb.cf.ch2;

/**
 * Εμφανίζει τους τύπους δεδομένων ακεραίων
 * int, byte short και long μαζί με το μέγεθός τους
 * και το range (min,max).
 */
public class IntApp {
    public static void main(String[] args) {
        //To BYTES είναι το scope που ανήκει στο wrapper class Integer. Αυτό το υποδηλώνει η τελεία.
        //To , μετά το %d βάζει υποδιαστολή και χωρίζει ανά χιλιάδες
        System.out.printf("Το μέγεθος ενός Integer σε bytes είναι: %d, Το μέγεθος ενός Integer σε bits είναι: %d bits, Min: %,d, Max: %,d\n", Integer.BYTES, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("byte. Size: %d bits, Min: %d, Max: %d\n", Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short. Size: %d bits, Min: %,d, Max: %,d\n", Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long. Size: %d bits, Min: %,d, Max: %,d\n", Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
    int num  = 135;

    }
}
