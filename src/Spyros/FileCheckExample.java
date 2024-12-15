package Spyros;

import java.nio.file.*;

public class FileCheckExample {

    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\spyro\\IdeaProjects\\Java\\src\\Spyros\\MovieDB.txt";

        // Check if the file exists and is readable
        if (canReadFile(filePath)) {
            System.out.println("The file is accessible and can be read.");
            // Add additional file operations here
        } else {
            System.out.println("The file cannot be read or does not exist.");
        }
    }

    // Method to check if the file exists and is readable
    public static boolean canReadFile(String filePath) {
        Path fileDirectory = Paths.get(filePath);

        // Check if the file exists and if it is readable
        return Files.exists(fileDirectory) && Files.isReadable(fileDirectory);
    }
}
