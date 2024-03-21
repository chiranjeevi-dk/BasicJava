package java_Basics;

import java.util.Scanner;

public class ArmStrongNumberSeries
{

    public static void main(String[] args)
    {
             Scanner Scan = new Scanner(System.in);
             System.out.println("Enter the number until the series want to be checked");
        while(Scan.hasNext())
        {
            int num = Scan.nextInt();
            ArmstrongSeries(num);
            System.out.println("Enter the number until the series want to be checked");
        }

    }

    private static void ArmstrongSeries(int n)
    {
        int count = 0;
        for (int i = 0 ; i <= n ; i++) {
            int num = i, rem, digit = 0, sum = 0;
            // Copy the value for num in num
            // Find total digits in num
            digit = (int)Math.log10(num) + 1;
            // Calculate sum of power of digits

            while (num > 0) {
                rem = num % 10;
                sum = sum + (int)Math.pow(rem, digit);
                num = num / 10;
            }

            // Check for Armstrong number
            if (i == sum)
                System.out.println(i);
        }


    }


}
