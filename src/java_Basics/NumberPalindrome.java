package java_Basics;

import java.util.Scanner;
public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked :");
        while(sc.hasNext())
        {
            int Number = sc.nextInt();
            isPalindrome(Number);
        }
    }

    private static void isPalindrome(int number) {
        int reverse = 0,rev=0;
        int num = number;
        while(number != 0)
        {
            reverse = number % 10;
            rev = 10 * rev + reverse;
            number = number / 10;
        }
        if(rev == num)
        {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
