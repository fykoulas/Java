package gr.aueb.cf.ch6;
import java.util.Random;

import java.util.Random;

public class GridExample {
    public static void main(String[] args) {
        // Define a 3x4 grid (2D array)
        int[][] grid = new int[3][4];

        // Populate the grid with random integers
        Random random = new Random();
        for (int i = 0; i < grid.length; i++) { // Iterate over rows
            for (int j = 0; j < grid[i].length; j++) { // Iterate over columns
                grid[i][j] = random.nextInt(100); // Random integers between 0 and 99
            }
        }

        // Print the grid
        System.out.println("3x4 Grid with Random Integers:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println(); // New line after each row
        }
    }
}
