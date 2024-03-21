package ArrayRelated;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum {
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
        System.out.println("The 2d  array you created : ");
        for(int a=0;a< arr.length;a++)
            System.out.println(Arrays.toString(arr[a]));
        leftAndRightDiagonalSum(arr);

}

    private static void leftAndRightDiagonalSum(int[][] arr)
    {
        int sum = 0;
        int lastdigit = (arr[0].length)-1;
        for (int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                } else if ((i + j) == lastdigit) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of Left and Right Diagonal is :  "+sum);
    }
}
