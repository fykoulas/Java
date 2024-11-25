package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση πίνακα
 * - new
 * - unsized init
 * - array initializer
 * - print τα στοιχεία ενός πίνακα
 */
public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[10];                 // declare and init
        int[] arr2 = {1,2,3,4,5};               //unsized init
        int[] arr3 = new int[] {1,2,3,4,5};     //array initializer

        //Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;


        //Traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int item : arr) {
            System.out.print(item + " ");
        }

    }
}
