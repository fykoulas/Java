package gr.aueb.cf.ch6;

public class FindNumber {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 1, 5, 8, 4, 6, 0};
        int target = 0; // Στόχος που ψάχνουμε
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Το στοιχείο βρέθηκε." : "Το στοιχείο δεν βρέθηκε.");
    }
}
