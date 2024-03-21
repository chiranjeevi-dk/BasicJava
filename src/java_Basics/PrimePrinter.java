package java_Basics;

import java.util.Scanner;

public class PrimePrinter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the upper limit to find prime numbers (Enter '0' to exit):");
        long limit;

        while ((limit = scanner.nextLong()) != 0) {
            if (limit <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
                continue;
            }

            printPrimesUpTo(limit);
        }

        System.out.println("Exiting the program.");
        scanner.close();
    }

    private static void printPrimesUpTo(long limit) {
        boolean[] isPrime = new boolean[(int) (limit + 1)];

        System.out.println("Prime numbers up to " + limit + ":");

        for (int i = 2; i*i <= limit; i++) {
            if (!isPrime[i]) {
                System.out.println(i);  // Print the prime number
                for (long j = (long) i * i; j <= limit; j += i) {
                    if (j <= Integer.MAX_VALUE) {
                        isPrime[(int) j] = true;
                    } else {
                        break;  // Stop marking multiples beyond the array size
                    }
                }
            }
        }
    }
}
