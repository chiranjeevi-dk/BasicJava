package ArrayRelated;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Finding leader and printing");
        arrayLeader(arr);
    }

    private static void arrayLeader(int[] arr) {
        int maxFromRight = arr[arr.length - 1];

        // The rightmost element is always a leader
        System.out.println(maxFromRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.println(maxFromRight);
            }
        }

        if (arr[arr.length - 1] > maxFromRight)
        {
            System.out.println("Last element: " + arr[arr.length - 1]);
        }
    }
}




