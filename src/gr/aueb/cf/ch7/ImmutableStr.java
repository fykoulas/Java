package gr.aueb.cf.ch7;

public class ImmutableStr {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Factory";
        s1 = "Athens";

        //το Coding είναι πλέον garbage και το μαζεύει το automatic garbage collector (GC)
    }
}
