package Training_March19;

import java.util.Scanner;

public class pyramid
{
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n;
        if (sc.hasNextInt())
        {
            n = sc.nextInt();
            if (n <= 0)
            {
                System.out.println("Number of rows should be a positive integer.");
            }
            else
            {
                if(n%2==0)
                   evenPyramid(n);
                else
                    oddPyramid(n);
            }
        }
        else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        sc.close();
        }

    private static void evenPyramid(int n)
    {
        for( int row =0; row<n; row++)
        {
            for(int column=0; column<n; column++)
            {
                if((row+column)%2!=0 && ((row+column)>=(n-1)))
                   System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int column=1; column<n; column++)
            {
                if((row+column)%2==0 &&(row>=column))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void oddPyramid(int n)
    {
        for( int row =0; row<n; row++)
        {
            for(int column=0; column<n; column++)
            {
                if((row+column)%2==0 && ((row+column)>=(n-1) ))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int column=1; column<n; column++)
            {
                if((row+column)%2==0 &&(row>=column))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}