package Spyros;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

/*
Φιλτράρει csv με email τα οποία είναι άκυρα/fake/test και επιστρέφει csv με πολύ λιγότερα λάθη
 */

public class EmailFilter {

    // Regular expressions
    private static final Pattern consecutiveNumbersPattern = Pattern.compile("\\d{6,}"); // Matches 6 or more consecutive digits
    private static final Pattern excludedWordsPattern = Pattern.compile("(lightgear|mantemi|junk|test)", Pattern.CASE_INSENSITIVE); // Matches excluded words
    private static final Pattern consecutiveLettersPattern = Pattern.compile("(.)\\1{3,}"); // Matches 4 or more consecutive identical letters

    // Function to check if email contains more than 5 consecutive digits in the local part
    public static boolean containsConsecutiveNumbers(String email) {
        String localPart = email.substring(0, email.indexOf("@")); // Extract the local part of the email (before the '@')
        return consecutiveNumbersPattern.matcher(localPart).find(); // Check for 6 or more consecutive digits
    }

    // Function to check if email contains excluded words
    public static boolean containsExcludedWords(String email) {
        return excludedWordsPattern.matcher(email).find(); // Check for excluded words in the email body
    }

    // Function to check if email contains 3 or more consecutive identical letters
    public static boolean containsConsecutiveLetters(String email) {
        String localPart = email.substring(0, email.indexOf("@")); // Extract the local part of the email (before the '@')
        return consecutiveLettersPattern.matcher(localPart).find(); // Check for 3 or more consecutive identical letters
    }

    // Function to filter emails from a CSV file
    public static void filterEmails(String inputCsv, String outputCsv) throws IOException {
        List<String[]> filteredEmails = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputCsv))) {
            // Read the header line (assuming the first row is the header)
            String header = reader.readLine();
            filteredEmails.add(header.split(",")); // Add header to the result

            // Process each email in the CSV
            reader.lines().forEach(line -> {
                String[] columns = line.split(",");
                String email = columns[0]; // Assuming the email is in the first column

                // Apply filtering conditions
                if (!containsConsecutiveNumbers(email)
                        && !containsExcludedWords(email)
                        && !containsConsecutiveLetters(email)) {
                    filteredEmails.add(columns); // Add the row if it doesn't meet any exclusion criteria
                }
            });
        }

        // Write the filtered emails to a new CSV file
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputCsv))) {
            for (String[] row : filteredEmails) {
                writer.write(String.join(",", row));
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) {
        String inputCsv = "C:/Users/spyro/Desktop/ps_customer-unfiltered.csv"; // Path to the input CSV file
        String outputCsv = "C:/Users/spyro/Desktop/filtered_ps_customer.csv"; // Path to the output CSV file

        try {
            filterEmails(inputCsv, outputCsv);
            System.out.println("Filtered emails have been saved to " + outputCsv);
        } catch (IOException e) {
            System.err.println("Error processing the CSV file: " + e.getMessage());
        }
    }
}
