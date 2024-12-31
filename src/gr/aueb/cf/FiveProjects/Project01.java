package gr.aueb.cf.FiveProjects;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project01 {

    public static void main(String[] args) {
        String inFilePath = "C:/Users/spyro/Desktop/allnumbers.txt";
        String outFilePath = "C:/Users/spyro/Desktop/filtered_combinations.txt";

        try {
            String[] allNumbers = readNumbersFromFile(inFilePath);
            int[] numbers = Arrays.stream(allNumbers).mapToInt(Integer::parseInt).toArray();

            List<int[]> combinations = new ArrayList<>();
            generateCombinations(numbers, new int[6], 0, 0, combinations);

            try (PrintStream ps = new PrintStream(outFilePath)) {
                for (int[] combination : combinations) {
                    if (isValidCombination(combination)) {
                        ps.println(Arrays.toString(combination));
                        System.out.println(Arrays.toString(combination));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static String[] readNumbersFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder numbers = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.append(line).append(","); // Concatenate all numbers with a delimiter
            }
            return numbers.toString().split(",+\\s*"); // Split into an array
        }
    }

    public static void generateCombinations(int[] numbers, int[] temp, int start, int depth, List<int[]> combinations) {
        if (depth == 6) {
            combinations.add(Arrays.copyOf(temp, temp.length));
            return;
        }
        for (int i = start; i < numbers.length; i++) {
            temp[depth] = numbers[i];
            generateCombinations(numbers, temp, i + 1, depth + 1, combinations);
        }
    }

    public static boolean isValidCombination(int[] combination) {
        return filterEvenOdd(combination) &&
                filterConsecutiveNumbers(combination) &&
                filterSameEndings(combination) &&
                filterSameDecades(combination);
    }

    public static boolean filterEvenOdd(int[] combination) {
        int evens = 0, odds = 0;
        for (int num : combination) {
            if (num % 2 == 0) evens++;
            else odds++;
        }
        return evens <= 4 && odds <= 4; // At most 4 evens and 4 odds
    }

    public static boolean filterConsecutiveNumbers(int[] combination) {
        int consecutiveCount = 0;
        for (int i = 1; i < combination.length; i++) {
            if (combination[i] - combination[i - 1] == 1) consecutiveCount++;
            else consecutiveCount = 0;
            if (consecutiveCount > 1) return false; // More than 2 consecutive numbers
        }
        return true;
    }

    public static boolean filterSameEndings(int[] combination) {
        int[] endings = new int[10];
        for (int num : combination) {
            endings[num % 10]++;
        }
        for (int count : endings) {
            if (count > 3) return false; // More than 3 same endings
        }
        return true;
    }

    public static boolean filterSameDecades(int[] combination) {
        int[] decades = new int[10];
        for (int num : combination) {
            decades[num / 10]++;
        }
        for (int count : decades) {
            if (count > 3) return false; // More than 3 numbers in the same decade
        }
        return true;
    }
}
