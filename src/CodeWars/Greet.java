package CodeWars;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println(greet(name));
    }
        public static String greet(String name) {
            return "Hello, " + name + " how are you doing today?";

    }
}

