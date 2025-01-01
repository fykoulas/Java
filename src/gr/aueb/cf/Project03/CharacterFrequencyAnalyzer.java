package gr.aueb.cf.Project03;

import java.io.*;
import java.util.*;

public class CharacterFrequencyAnalyzer {
    private int[][] frequencyArray;
    private int uniqueChars;

    public CharacterFrequencyAnalyzer() {
        // Δημιουργία πίνακα 128x2
        frequencyArray = new int[128][2];
        uniqueChars = 0;
    }

    public void analyzeFile(String filename) throws IOException {
        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr)) {

            int c;
            while ((c = br.read()) != -1) {
                char character = (char) c;

                // Αγνοούμε whitespace χαρακτήρες
                if (!Character.isWhitespace(character)) {
                    updateFrequency(character);
                }
            }
        }
    }

    private void updateFrequency(char c) {
        // Αναζήτηση του χαρακτήρα στον πίνακα
        int index = findCharacter(c);

        if (index == -1) {
            // Νέος χαρακτήρας - προσθήκη στον πίνακα
            frequencyArray[uniqueChars][0] = c;  // Αποθηκεύει τον ASCII κωδικό
            frequencyArray[uniqueChars][1] = 1;
            uniqueChars++;
        } else {
            // Υπάρχων χαρακτήρας - αύξηση συχνότητας
            frequencyArray[index][1]++;
        }
    }

    private int findCharacter(char c) {
        for (int i = 0; i < uniqueChars; i++) {
            if (frequencyArray[i][0] == c) {
                return i;
            }
        }
        return -1;
    }

    public void printByCharacter() {
        System.out.println("\nΣτατιστικά ταξινομημένα κατά χαρακτήρα:");
        System.out.println("Χαρακτήρας | Συχνότητα");
        System.out.println("------------------------");

        // Δημιουργία προσωρινού πίνακα για ταξινόμηση
        int[][] sortedArray = Arrays.copyOf(frequencyArray, uniqueChars);

        // Ταξινόμηση με βάση τον χαρακτήρα
        Arrays.sort(sortedArray, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < uniqueChars; i++) {
            System.out.printf("    %c      |     %d%n",
                    (char)sortedArray[i][0], sortedArray[i][1]);
        }
    }

    public void printByFrequency() {
        System.out.println("\nΣτατιστικά ταξινομημένα κατά συχνότητα:");
        System.out.println("Χαρακτήρας | Συχνότητα");
        System.out.println("------------------------");

        // Δημιουργία προσωρινού πίνακα για ταξινόμηση
        int[][] sortedArray = Arrays.copyOf(frequencyArray, uniqueChars);

        // Ταξινόμηση με βάση τη συχνότητα (φθίνουσα)
        Arrays.sort(sortedArray, (a, b) -> Integer.compare(b[1], a[1]));

        for (int i = 0; i < uniqueChars; i++) {
            System.out.printf("    %c      |     %d%n",
                    (char)sortedArray[i][0], sortedArray[i][1]);
        }
    }

    public static void main(String[] args) {
        CharacterFrequencyAnalyzer analyzer = new CharacterFrequencyAnalyzer();

        try {
            analyzer.analyzeFile("C:/Users/spyro/Desktop/file7.txt");
            analyzer.printByCharacter();
            analyzer.printByFrequency();

        } catch (IOException e) {
            System.err.println("Σφάλμα κατά την ανάγνωση του αρχείου: " + e.getMessage());
        }
    }
}