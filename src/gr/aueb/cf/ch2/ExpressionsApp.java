package gr.aueb.cf.ch2;

/**
 * Expressions demo
 */
public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        result1 = num1++; //post-increment: πρώτα γίνεται assigned to num1 στο result1 και μετά το num1 αυξάνεται κατά 1.
        result2 = ++num1; //pre-increment: πρώτα γίνεται τo αυξάνεται κατά 1 και μετά γίνεται assigned στο result1.

        System.out.println();


        //num1++ είναι το ίδιο με num1 = num1 + 1 και ίδιο με το num1 +=1
        //λέγονται shorthands αυτά
    }
}
