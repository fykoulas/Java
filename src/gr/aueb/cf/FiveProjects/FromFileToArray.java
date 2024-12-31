package gr.aueb.cf.FiveProjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FromFileToArray {
    public static void main(String[] args) {
        String inFilePath = "C:/Users/spyro/Desktop/allnumbers.txt";

        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath))) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");

            for (String token : tokens)  {
                System.out.print(token.trim() + " ");
            }

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }















    }
}
