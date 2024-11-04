package gr.aueb.cf.ch2;

/**
 * x = 10
 * y = 85
 * d = 30
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
//      double jumps = 0;
////    jumps = Math.ceil((target - start) / (double) hop);

        int jumps = 0;
           jumps = (int) Math.ceil((target - start) / (double) hop); //Η ceil απαιτεί double αλλά το jumps είναι int, για αυτό την μετατρέπουμε σε int

        System.out.println("Jumps:" + jumps);
    }
}
