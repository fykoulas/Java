package gr.aueb.cf.ch6;

public class ArrayHello {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = new int[2];                        // declare and init

        //Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;
        arr2[0] = 12;
        arr2[1] = 14;

        //Traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
