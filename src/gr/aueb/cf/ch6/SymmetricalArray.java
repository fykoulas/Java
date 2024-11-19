package gr.aueb.cf.ch6;

public class SymmetricalArray {
    public static void main(String[] args) {

        // Example arrays
        int[] array1 = {1, 2, 3, 2, 1};
        int[] array2 = {1, 2, 3, 4, 5};

        // Check if arrays are symmetrical
        System.out.println("Array1 is symmetrical: " + isSymmetrical(array1)); // Expected: true
        System.out.println("Array2 is symmetrical: " + isSymmetrical(array2)); // Expected: false
    }

    public static boolean isSymmetrical(int[] arr) {
        int n = arr.length;

        // Compare elements from the beginning and the end
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false; // If a mismatch is found, it's not symmetrical
            }
        }

        return true; // If no mismatches are found, it's symmetrical
    }

}

