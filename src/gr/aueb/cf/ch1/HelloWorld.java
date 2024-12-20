package gr.aueb.cf.ch1;

/**
 * Prints Hello Coding Factory in
 * standard output (console).
 */
public class HelloWorld {
// Η main είναι μέθοδος
    public static void main(String[] args) {
        // Prints Hello Coding Factory
        /*
         * Prints in standard output
         * "Hello Coding Factory"
         */
        System.out.println("Hello Coding Factory!");    // Prints Hello Coding Factory
        System.out.print("Hello World!");
        int booksNumber = 3;
        int age = 2;
        boolean isRaining;
        int sum = 10;
        //Οι final μεταβλητές δεν αλλάζουν και κατά σύμβαση γράφονται με ΚΕΦΑΛΑΙΑ (PI)
        final double PI = 3.14;
        System.out.print(PI);
        System.out.println(" Η ηλικία είναι " + (age) + " και οι αριθμοί βιβλίων είναι " + (booksNumber));
        System.out.println(" Η ηλικία είναι " + (age) + " και οι αριθμοί βιβλίων είναι " + (booksNumber));
    }

}