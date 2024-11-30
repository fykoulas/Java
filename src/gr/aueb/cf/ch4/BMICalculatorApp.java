package gr.aueb.cf.ch4;

import java.util.Scanner;

public class BMICalculatorApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight = 0;
        double height = 0;
        double bmi = 0;

        System.out.println("Enter your height in meters and your weight in kgs: ");
        height = in.nextDouble();
        weight = in.nextDouble();

        bmi = (weight / (height*height));

        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println(" BMI VALUES\n" +
                " Underweight: less than 18.5\n" +
                " Normal: between 18.5 and 24.9\n" +
                " Overweight: between 25 and 29.9\n" +
                " Obese: 30 or greater");

    }
}
