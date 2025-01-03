package CodeWars;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        String message = "Hello, World!";

        // Move the message across the screen
        for (int i = 0; i < 100; i++) {
            String spaces = " ".repeat(i);  // Create spaces to move the text
            System.out.print("\r" + spaces + message);  // "\r" returns the cursor to the beginning of the line
            Thread.sleep(50);  // Pause for 150 milliseconds to create the animation effect
        }

        // After the animation, print the final position
        System.out.println("\r" + message);
    }
}
