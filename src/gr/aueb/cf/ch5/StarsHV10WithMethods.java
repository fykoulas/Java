package gr.aueb.cf.ch5;

/**
 * Εκτυπώνει 10 γραμμές με 10 stars η κάθε γραμμή.
 */
public class StarsHV10WithMethods {

    public static void main(String[] args) {
        // Call the method to print the grid of stars
        printStarGrid(10, 10);
    }

    // Method to print a grid of stars
    public static void printStarGrid(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            printNewLine(); // Call the method to print a new line
        }
    }

    // Method to print a new line
    public static void printNewLine() {
        System.out.println();
    }
}