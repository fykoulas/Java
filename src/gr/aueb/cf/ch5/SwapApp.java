package gr.aueb.cf.ch5;

/**
 * The issue with your code is that the swap method does not actually change the values of a and b in the main method.
 * This is because Java passes primitive data types (like int) by value, not by reference.
 * When you pass a and b to the swap method, it only modifies the local copies of a and b within the swap method,
 * not the original values in main.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("a=%d, b=%d\n", a, b);
        swap(a, b);
        System.out.printf("a=%d, b=%d", a, b);
    }

    /**
     * Mutually exchanges the values of the two
     * input variables.
     *
     * @param a     the first input.
     * @param b     the second input.
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }


}