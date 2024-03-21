package java_Basics;

import java.util.Scanner;

public class OddDigits {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0, digit=0;
        while(num!=0)
        {
            digit=num%10;
            if(digit%2!=0)
                count++;
            num=num/10;
        }
        System.out.println("The Number of odd digits in the given Number : "+count);
    }
}
