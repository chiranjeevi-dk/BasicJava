
package Training_March19;

import java.util.Scanner;

public class fishPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Number of rows should be a positive integer.");
            } else {
                   triangle(n);
            }
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        sc.close();
    }// Close the Scanner object to prevent resource leakage

    private static void triangle(int n)
    {
        for( int row=0; row <n ; row++)
        {
            for(int column=0; column<n; column++)
            {
                if( row>=column )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int column=1; column<n; column++)
            {
                if( row+column>=n-1 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int column=1; column<n; column++)
            {
                if( row>=column )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for( int row=1; row <n ; row++)
        {
            for(int column=0; column<n ; column++)
            {
                if(row+column<=n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int column=1; column<n ; column++)
            {
                if(row<=column)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int column=1; column<n ; column++)
            {
                if(row+column<=n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

    }
}
