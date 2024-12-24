package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;
import java.nio.file.Paths;

public class BinaryAppExercise {

    public static void main(String[] args) {
        int b;
        String filename = "";
        String filenameOut = "";
        int counter = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter filename");
        filename = scanner.nextLine();
        filenameOut = UUID.randomUUID().toString().replace(":", "_") + filename;


        try (FileInputStream fis = new FileInputStream("C:/Users/spyro/Desktop/" + filename);
             FileOutputStream fos = new FileOutputStream("C:/Users/spyro/Desktop/" + filenameOut)) {

                        while ((b = fis.read()) != -1) {
                fos.write(b);
                counter++;
            }
            String fileExtension = filenameOut.substring(filenameOut.lastIndexOf("."));
            System.out.printf("Το αρχείο με μέγεθος %.1fKB (%d bytes) αντιγράφηκε επιτυχώς\n", (counter / 1024.0), counter);
            System.out.println("Το πλήρες όνομα του αρχικού αρχείου είναι: " + Paths.get(filename).toAbsolutePath());
            System.out.println("Το πλήρες όνομα του τελικού αρχείου είναι: " + Paths.get(filenameOut).toAbsolutePath());
            System.out.println("Η κατάληξη των αρχείων είναι: " + fileExtension);
            System.out.printf("Το αρχείο με μέγεθος %.1fKB (%d bytes) αντιγράφηκε επιτυχώς\n", (counter / 1024.0), counter);


        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}