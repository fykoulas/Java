package gr.aueb.cf.ch6;

public class ArrayMinMax2 {
    public static void main(String[] args) {

    }
    public static int getMinPosition(int[] arr, int low, int high) {
        if (arr == null || arr.length < 1 || low < 0 || high >= arr.length || low > high) {
            return -1; // Invalid input
        }

        int minPosition = low;
        int minValue = Integer.MAX_VALUE;

        for (int i = low; i <= high; i++) { // Loop through indices, not values
            if (arr[i] < minValue) {
                minPosition = i;    // Update position of the minimum value
                minValue = arr[i];  // Update the minimum value
            }
        }

        return minPosition;
    }

}
