package java_Basics;

import java.util.Scanner;

public class ArmStrongNumber
{
    public static void main(String[] args)
        {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number to be checked as Armstrong number(Enter 0 to exit)");
        int num;
        while((num=Scan.nextInt())!=0)
        {
            isArmstrong(num);
            System.out.println("Enter the number to be checked as Armstrong number(Enter 0 to exit)");
        }
        }
    private static void isArmstrong(int num)
    {
        int arms = num ;
        int  rem =0,sum=0;
        while(num>0){
             rem = num%10;
             sum=sum+(rem*rem*rem);
             num = num/10;
        }
        if(arms==sum)
        {
            System.out.println("The Number is an armstrong number");
        }
        else {
            System.out.println("The Number is not an armstrong number"
            );
        }
    }
}
