package java_Basics;

import java.util.Scanner;

public class PerfectPalindrome
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be checked for perfectPalindrome : \n");
        int number =sc.nextInt();
        boolean output = isPerfectPalindrome(number);

        System.out.println(output ? "the number is perfect palindrome" : "The number is not a perfect palindrome");
    }

    private static boolean isPerfectPalindrome(int number)
    {
        int check = number;
        int rev=0,rem=0;
        boolean pflag=false,sflag=false;

        while(check>0)
        {
            rem=check%10;
            rev=rev*10+rem;
            check=check/10;
        }
        if (rev == number )
            pflag=true;
        else
            return false;
        for(int i=0;i<=number;i++)
        {
            if(i*i==number)
                sflag = true;

        }
        if(sflag&&pflag)
            return true;
        return false;
    }

}
