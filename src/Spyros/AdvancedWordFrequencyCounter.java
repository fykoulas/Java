package Spyros;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class AdvancedWordFrequencyCounter {
    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        String filePath = "MovieDB.txt"; // Replace with your file path
        int topN = 5; // Top N most frequent words
        int numThreads = 4;

        // Read file into a single string
        String text = Files.readString(Paths.get(filePath));

        // Split text into words
        List<String> words = Arrays.stream(text.split("\\W+"))
                .filter(word -> !word.isBlank())
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        // Divide work among threads
        int chunkSize = (int) Math.ceil((double) words.size() / numThreads);
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<Map<String, Integer>>> futures = new ArrayList<>();

        // Submit tasks to count words in chunks
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, words.size());
            List<String> chunk = words.subList(start, end);

            futures.add(executor.submit(() -> countWords(chunk)));
        }

        // Merge results from all threads
        Map<String, Integer> mergedWordCounts = new ConcurrentHashMap<>();
        for (Future<Map<String, Integer>> future : futures) {
            future.get().forEach((word, count) ->
                    mergedWordCounts.merge(word, count, Integer::sum));
        }

        executor.shutdown();

        // Find the top N most frequent words
        List<Map.Entry<String, Integer>> topWords = mergedWordCounts.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(topN)
                .collect(Collectors.toList());

        // Display results
        System.out.println("Top " + topN + " most frequent words:");
        topWords.forEach(entry ->
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }

    // Helper method to count words in a list
    private static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }
}
