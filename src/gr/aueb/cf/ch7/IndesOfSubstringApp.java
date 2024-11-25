package gr.aueb.cf.ch7;
import java.lang.String;

public class IndesOfSubstringApp {
    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); //1
        int positionOfSecondo = cf.indexOf("o", 2);
        int lastPositionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring(0); // "Coding Factory"
        String cf3 = cf.substring(1); // "oding Factory"
        String slice = cf.substring(1,3); // "od"

        System.out.println(cf2);
        System.out.println(cf3);
        System.out.println(slice);
    }
}
