package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SeparatingDigitsAppWithArrays {
    public static void main(String[] args) {
        int InputNumber = 0;
        int num;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        InputNumber = in.nextInt();
        String InputNumberStr = String.valueOf(InputNumber);

        int[] numbers = new int[InputNumberStr.length()];

        for (int i = 0; i < InputNumberStr.length(); i++) {
            numbers[i] = Character.getNumericValue(InputNumberStr.charAt(i));
        }

        System.out.println("Digits in the array: ");
        for (int el : numbers) {
            System.out.print(el + " ");
        }

    }
}
