package gr.aueb.cf.ch6;

public class MaximumFromArray {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 1, 5, 8, 4, 6, 0};
        int max = array[0];  // Υποθέτουμε αρχικά ότι το πρώτο στοιχείο είναι το μέγιστο

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];  // Ενημερώνουμε το max αν βρούμε μεγαλύτερο στοιχείο
            }
        }

        System.out.println("Το μέγιστο στοιχείο είναι: " + max);
    }
}
