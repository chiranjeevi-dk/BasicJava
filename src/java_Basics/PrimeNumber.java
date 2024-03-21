package java_Basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to be checked as Prime or Not (Enter '0' to exit)");
        int num;
        while ((num = scan.nextInt()) != 0) {
            if (isPrime(num)) {
                System.out.println("Yes, this number is a Prime");
            }
            else {
                System.out.println("No, this number is not a Prime");
            }
            System.out.println("Enter the number to be checked as Prime or Not (Enter '0' to exit)");
        }
        System.out.println("Exiting the program.");
        scan.close();
    }
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // If num is divisible by any number between 2 and sqrt(num), it's not prime
            }
        }
        return true; // If no divisors are found, it's a prime number
    }
}
