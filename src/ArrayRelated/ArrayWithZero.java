package ArrayRelated;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array");
        int arraySize = sc.nextInt();
        int[] inputArray = new int[arraySize];

        // Populate the array
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = sc.nextInt();
        }
        System.out.println("The array is : ");
        System.out.println(Arrays.toString(inputArray));

        // Move 0 values to the end
        int nonZeroIndex = 0;
        for (int i = 0; i < arraySize; i++) {
            if (inputArray[i] != 0) {
                inputArray[nonZeroIndex] = inputArray[i];
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < arraySize; i++)
        {
            inputArray[i] = 0;
        }
        System.out.println("The Array after moving all zeros to end");
        System.out.println(Arrays.toString(inputArray));
        sc.close();  // Close the scanner
    }
}
