package Training_March18;

import java.util.Scanner;

public class StarPatternRight {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Number of rows should be a positive integer.");
            } else {
                printStarPatternIncreasingRight(n);
                printStarPatternDecreasingRight(n);
            }
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        sc.close(); // Close the Scanner object to prevent resource leakage
    }

    public static void printStarPatternDecreasingRight(int n) {
        int num = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            num--;
            System.out.println();
        }
    }

    public static void printStarPatternIncreasingRight(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
