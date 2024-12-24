package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LocationsAppExercise {

    public static void main(String[] args) {
        String inFilePath = "C:/Users/spyro/Desktop/locations.txt";
        String outFilePath = "C:/Users/spyro/Desktop/locationsJSON.txt";
        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("Location,Latitude,Longitude")) {
                    continue;
                }
                tokens = line.split(",+\\s*");
                printJSON(ps, tokens);
                printJSON(System.out, tokens);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printJSON(PrintStream ps, String[] tokens) {
        ps.printf("{ location: %s, latitude: %s, longitude: %s },\n", tokens[0], tokens[1], tokens[2]);
    }
}