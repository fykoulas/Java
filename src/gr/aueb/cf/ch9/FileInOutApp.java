package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {

    public static void main(String[] args) {
        File inFd = new File("C:/Users/spyro/Desktop/file7.txt");
        File outFd = new File("C:/Users/spyro/Desktop/file7-out.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(inFd);
             PrintWriter ps = new PrintWriter(outFd, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token.trim() + " ");
                    ps.printf("%s ", token);
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}