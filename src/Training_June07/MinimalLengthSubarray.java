package Training_June07;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Finds the minimal length of a contiguous subarray using the brute force approach.
 */
class BruteForceApproach {
    public int findMinimalSubarrayLength(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE; // Initialize with a large number

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum >= target) {
                    int length = j - i + 1;
                    minLength = Math.min(minLength, length);
                    break; // Stop the inner loop once we found a valid subarray
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

/**
 * Finds the minimal length of a contiguous subarray using the prefix sums and binary search approach.
 */
class PrefixSumBinarySearchApproach {
    public int findMinimalSubarrayLength(int target, int[] nums) {
        int n = nums.length;

        // Compute prefix sums
        int[] prefixSums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }

        int minLength = Integer.MAX_VALUE;

        // Iterate over the prefix sums array and use binary search to find the smallest subarray length
        for (int i = 0; i < n; i++) {
            int requiredSum = prefixSums[i] + target;
            int pos = Arrays.binarySearch(prefixSums, requiredSum);
            if (pos < 0) {
                pos = -pos - 1;
            }
            if (pos <= n) {
                minLength = Math.min(minLength, pos - i);
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

/**
 * Finds the minimal length of a contiguous subarray using the sliding window approach.
 */
class SlidingWindowApproach {
    public int findMinimalSubarrayLength(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE; // Initialize with a large number
        int currentSum = 0; // Stores the sum of the current window
        int start = 0; // Starting index of the sliding window

        // Loop through the array with the end pointer
        for (int end = 0; end < n; end++) {
            currentSum += nums[end]; // Add the current element to the sum

            // Shrink the window as small as possible while the window sum is larger than or equal to target
            while (currentSum >= target) {
                minLength = Math.min(minLength, end - start + 1); // Update the minimal length
                currentSum -= nums[start]; // Remove the starting element from the sum
                start++; // Move the start pointer to the right
            }
        }

        // If minLength was never updated, it means no valid subarray was found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

/**
 * Main class to handle user input and method selection.
 */
public class MinimalLengthSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the number of cargo weights:");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the cargo weights:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Read the target weight
        System.out.println("Enter the target weight:");
        int target = sc.nextInt();

        // Choose method
        System.out.println("Choose method: 1 for Brute Force, 2 for Prefix Sum + Binary Search, 3 for Sliding Window");
        int method = sc.nextInt();

        int result = 0;
        switch (method) {
            case 1:
                BruteForceApproach bruteForce = new BruteForceApproach();
                result = bruteForce.findMinimalSubarrayLength(target, nums);
                break;
            case 2:
                PrefixSumBinarySearchApproach prefixSumBS = new PrefixSumBinarySearchApproach();
                result = prefixSumBS.findMinimalSubarrayLength(target, nums);
                break;
            case 3:
                SlidingWindowApproach slidingWindow = new SlidingWindowApproach();
                result = slidingWindow.findMinimalSubarrayLength(target, nums);
                break;
            default:
                System.out.println("Invalid method chosen.");
                sc.close();
                return;
        }

        System.out.println("The minimal length of the subarray is: " + result);

        sc.close();
    }
}
