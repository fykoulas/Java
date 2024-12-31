package Spyros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class RandomFile {
    public static void main(String[] args) {
        String inFilePath = "C:/Users/spyro/Desktop/allnumbers.txt";
        String outFilePath = "C:/Users/spyro/Desktop/lottonumbers.txt";
        String line;
        String[] tokens;


        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
                String[] lottoNumbers = randomPick(tokens, 6);
                printFormatted(ps, lottoNumbers);
                printFormatted(System.out, lottoNumbers);

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static String[] randomPick(String[] numbers, int n) {
        Random rand = new Random();
        String[] lottoNumbers = new String[n];

        for (int i = 0; i < n; i++) {
            lottoNumbers[i] = numbers[rand.nextInt(numbers.length)];
        }

        return lottoNumbers;
    }

    public static void printFormatted(PrintStream ps, String[] lottoNumbers) {
        ps.printf("{ No1: %s, No2: %s, No3: %s, No4: %s, No5: %s, No6: %s },\n", lottoNumbers[0], lottoNumbers[1], lottoNumbers[2], lottoNumbers[3], lottoNumbers[4], lottoNumbers[5]);
    }
}