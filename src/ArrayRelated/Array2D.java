package ArrayRelated;

import java.util.*;
public class Array2D {
    public static void main(String[]args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number of Rows:");
        int A = sc.nextInt();
        System.out.print("enter number of Columns:");
        int B = sc .nextInt();
        if (A <= 0 || B <= 0) {
            System.out.println("Invalid input: Rows and columns must be greater than 0.");
            sc.close();
            return;
        }
        int[][] arr = new int[A][B];
        for (int i=0;i<A;i++) {
            for (int j=0;j<B;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("\nThe 2D Array is:");
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // Move to the next row for better formatting
        }
        int sum=0, max=0;
        for (int i = 0; i < A; i++) {
            for (int j = 0; j <B; j++) {
                sum= sum+arr[i][j];
            }
//System.out.print("Sum of Row"+" "+ (i + 1) +" is :");
          //  System.out.println(sum); // Move to the next row for better formatting
             if (max<sum)
             {
                 max=sum;
             }
             sum=0;
        }
        System.out.println("Max value of row is :"+max);
        /*for (int i= 0; i <B; i++)
         {
            for (int j = 0; j <A ; j++)
             {
                sum= sum+arr[j][i];
             }
            System.out.print("Sum of Columns"+" "+ (i + 1) +" is :");
            System.out.println(sum); // Move to the next row for better formatting
            sum=0;
         }
        */
    }
}