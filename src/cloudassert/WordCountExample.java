package cloudassert;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class WordCountExample {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string to count the number of words:");
        String inputString = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Count the words in the input string using different methods
        long wordCountStream = countWordsUsingStream(inputString);
        int wordCountManual = countWordsUsingManualIteration(inputString);
        int wordCountSplit = countWordsUsingSplit(inputString);
        int wordCountTokenizer = countWordsUsingTokenizer(inputString);

        // Display the results
        System.out.println("Number of words using Stream: " + wordCountStream);
        System.out.println("Number of words using Manual Iteration: " + wordCountManual);
        System.out.println("Number of words using Split: " + wordCountSplit);
        System.out.println("Number of words using StringTokenizer: " + wordCountTokenizer);
    }

    public static long countWordsUsingStream(String str) {
        // Check if the string is empty or null
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Use a stream to split the string and count the words
        return Arrays.stream(str.trim().split("\\s+"))
                .count();
    }

    public static int countWordsUsingManualIteration(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is not whitespace
            if (!Character.isWhitespace(str.charAt(i))) {
                if (!isWord) {
                    isWord = true;
                    wordCount++;
                }
            } else {
                isWord = false;
            }
        }

        return wordCount;
    }

    public static int countWordsUsingSplit(String str) {
        // Check if the string is empty or null
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Split the string by spaces
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static int countWordsUsingTokenizer(String str) {
        // Check if the string is empty or null
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Use StringTokenizer to split the string
        StringTokenizer tokenizer = new StringTokenizer(str);
        return tokenizer.countTokens();
    }
}
