package ArrayRelated;
import java.util.Scanner;
public class FindIn2DArray
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number of Rows:");
        int A = sc.nextInt(); // declaring row size
        int rows = A;
        System.out.print("enter number of Columns:");
        int B = sc .nextInt(); // declaring column size
        int columns = B;
        if (A <= 0 || B <= 0)   // if size is given in negative
        {
            System.out.println("Invalid input: Rows and columns must be greater than 0.");
            sc.close();
            return;
        }       
        int[][] arr = new int[A][B];  // instatitating an array 2d
        for (int i=0;i<A;i++) {
            for (int j=0;j<B;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nThe 2D Array is:"); // printing the 2d array
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // Move to the next row for better formatting
        }
        System.out.println("Enter the Number to find coordinates");
        int findCod = sc.nextInt();

        for (int i=0;i<A;i++)
        {
            for (int j=0;j<B;j++)
            {
                if(findCod==arr[i][j])
                {
                    System.out.println(i+" "+j);
                }
            }
        }
        System.out.println("enter the coordinates to update  ");
        int r= sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the num to be updated");
        int newnum =sc.nextInt();
        arr[r][c]=newnum;
        System.out.println("\nThe 2D Array is:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // Move to the next row for better formatting
        }
    }
}
















