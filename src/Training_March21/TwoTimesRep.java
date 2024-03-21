package Training_March21;

import java.util.Arrays;
import java.util.Scanner;

class TwoTimesRep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int elements = sc.nextInt();

        if (elements < 2) {
            System.err.println("Error: Array must contain at least 2 elements.");
            return; // Exit program if invalid input
        }

        int[] nums = new int[elements];
        for (int i = 0; i < elements; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums)); // Optional: Print the array

        int result = singleNumber(nums);

        if (result == 0) {
            System.out.println("All elements are unique. No element appears twice.");
        } else {
            System.out.println("The element which repeated twice : " + result);
        }
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
