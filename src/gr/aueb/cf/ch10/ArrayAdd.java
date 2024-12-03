package gr.aueb.cf.ch10;

public class ArrayAdd {
    public static void main(String[] args) {

    }

    public static int[] addOne(int[] arr){
        int[] arrOut;
        int currentSum;
        int carry = 1;

        if (arr == null) throw new IllegalArgumentException("Error. Array must not be null");
        arrOut = new int[arr.length + 1];

        for (int i = arr.length -1; i >= 0; i--) {
            currentSum = arr[i] + carry;

            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }

        arrOut[0] = (carry == 1) ? 1 : 0;
        return arrOut;
    }


}
