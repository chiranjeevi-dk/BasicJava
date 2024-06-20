package ArrayRelated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NonNegativeSubArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the ArrayList:");
        int size = Integer.parseInt(reader.readLine());

        ArrayList<Integer> inputArray = new ArrayList<>(size);

        System.out.println("Enter the elements in the ArrayList (separated by spaces):");

        // Read the entire line of input
        String inputLine = reader.readLine();

        // Use StringTokenizer to parse the input line
        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        // Ensure that the number of tokens matches the expected size
        if (tokenizer.countTokens() != size) {
            System.out.println("The number of elements entered does not match the specified size.");
            return;
        }

        try {
            while (tokenizer.hasMoreTokens()) {
                int element = Integer.parseInt(tokenizer.nextToken());
                inputArray.add(element);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
            return;
        }

        ArrayList<Integer> longestNonNegSubArray = findLongestNonNegativeSubArray(inputArray);

        if (longestNonNegSubArray.isEmpty()) {
            System.out.println("No non-negative subarray found.");
        } else {
            for (int element : longestNonNegSubArray) {
                System.out.println(element);
            }
        }
    }

    private static ArrayList<Integer> findLongestNonNegativeSubArray(ArrayList<Integer> inputArray) {
        ArrayList<Integer> longestNonNegSubArray = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;

        for (int i = 0; i < inputArray.size(); i++) {
            if (inputArray.get(i) >= 0) {
                temp.add(inputArray.get(i));
                tempSum += inputArray.get(i);
            } else {
                if (tempSum > maxSum || (tempSum == maxSum && temp.size() > longestNonNegSubArray.size())) {
                    maxSum = tempSum;
                    longestNonNegSubArray = new ArrayList<>(temp);
                }
                temp.clear();
                tempSum = 0;
            }
        }

        // Check once more at the end of the loop in case the longest subarray is at the end
        if (tempSum > maxSum || (tempSum == maxSum && temp.size() > longestNonNegSubArray.size())) {
            longestNonNegSubArray = new ArrayList<>(temp);
        }

        return longestNonNegSubArray;
    }
}
