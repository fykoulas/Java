package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo
 */
public class BigIntApp {
    public static void main(String[] args) {
        //Declarations & Initializations
        BigInteger bigNum1 = new BigInteger("123121242349823409823409823234123123");
        BigInteger bigNum2 = new BigInteger("1231265498765423412312323498098234");
        BigInteger result;
        //Commands
        result = bigNum1.add(bigNum2);
        //Printing the results
        System.out.printf("%,d", result);


    }
}
