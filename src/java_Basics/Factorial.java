package java_Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Factorial tamil = new Factorial();
        tamil.facto(num);
        sc.close();
    }

    private void facto(int num) {
        if(num==0)
        {
            System.out.println(1);
        }
        else{
            int fact=1;
            for(int i =1; i<=num;i++)
            {
                fact = fact*i ;
            }
            System.out.println(fact);
        }
    }
}