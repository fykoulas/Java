package gr.aueb.cf.ch7;

public class StrCopy {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;

        System.out.println(s1); //παραμένει ως έχει
        System.out.println(s2); //αντιγράφεται, επειδή είναι immutable

    }
}
