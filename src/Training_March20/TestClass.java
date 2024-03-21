package Training_March20;

import java.util.Scanner;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int blocks = sc.nextInt();
        int[] a = new int[blocks];
        int[] b = new int[blocks];

        // Input for array a
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Input for array b
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int result = testArray(a, b);
        System.out.println(result);
    }

    private static int testArray(int[] arr1, int[] arr2) {
        int ok = sameNumber(arr1);
        int steps = 0;

        if (ok != -1) {
            for (int i = 0; i < arr1.length; i++) {
                while (arr1[i] > ok) {
                    arr1[i] -= arr2[i];
                    steps++;
                }
            }
            return steps;
        } else {
            return -1; // No common number found in arr1
        }
    }

    private static int sameNumber(int[] arr1) {
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    return arr1[i];
                }
            }
        }
        return -1; // No common number found
    }
}
