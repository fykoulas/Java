package gr.aueb.cf.ch1;

public class Checkerboard {
    public static void main(String[] args) {
        // Outer loop for the number of rows (8 rows)
        for (int row = 0; row < 20; row++) {
            // Inner loop for the number of columns (8 columns)
            for (int col = 0; col < 20; col++) {
                // Print an asterisk and a space
                if ((row + col) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}