package CodeWars;

import java.util.Random;

public class CodeWarsAreaOrPerimeter {
public static void main(String[] args) {
    Random random = new Random();

    int length = random.nextInt(99) + 1;
    int width = random.nextInt(99) + 1;
    int result = areaOrPerimeter(length, width);

    System.out.println("Result: " + result);
}

public static int areaOrPerimeter (int l, int w) {
    return l == w ? l * w : (l + w) * 2;
//    if  (l == w){
//        return (l * w);
//        } else {
//        return 2 * (l + w);
//        }
    }

}
