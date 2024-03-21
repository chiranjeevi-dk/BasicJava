package java_Basics;

import java.util.Scanner;

public class FirstNnumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numbers = sc.nextInt();
        int sum =0 ;
        for(int i=1;i<=Numbers;i++)
        {
            sum = sum+ i;
        }
        System.out.println(sum);

    }
}
