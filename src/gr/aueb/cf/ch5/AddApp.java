package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το άθροισμα 2 ακεραίων με τη χρήση μεθόδων.
 */
public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = 0;
        int sub = 0;

        sum = add(a, b);
        sub = sub(a, b); // Add.App.sub(a, b);

        System.out.println(sum);
        System.out.println(sub);
    }

    public static int add(int a, int b){
//      int result = 0;
//      result = a + b;
//      return result;
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

}
