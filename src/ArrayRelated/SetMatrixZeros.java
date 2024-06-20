package ArrayRelated;
//https://www.interviewbit.com/problems/set-matrix-zeros/
import java.util.HashSet;
import java.util.Scanner;

public class SetMatrixZeros {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int A = sc.nextInt();
        System.out.print("enter number of Columns:");
        int B = sc.nextInt();
        if (A <= 0 || B <= 0) {
            System.out.println("Invalid input: Rows and columns must be greater than 0.");
            sc.close();
            return;
        }
        int[][] arr = new int[A][B];
        System.out.println ("Enter the value of elements 0 or 1");
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] zerosArray = setMatrixZeros(arr,A,B);
        System.out.println("\nThe Matrix with zeros  is:");
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.print(zerosArray[i][j] + "\t");
            }
            System.out.println(); // Move to the next row for better formatting
        }


    }

    private static int[][] setMatrixZeros(int[][] arr,int rows, int  columns) {

        int[][] zerosArray = new int[rows][columns];
        HashSet<Integer> zeroColumnIndex = new HashSet<>();
        for(int rowIndex=0; rowIndex<rows; rowIndex++)
        {
            boolean zeroRow = false;
            for(int columnIndex=0; columnIndex<columns; columnIndex++)
            {
                if(arr[rowIndex][columnIndex] == 0)
                {
                    zeroRow = true;
                    zeroColumnIndex.add(columnIndex);
                }

            }
            if(zeroRow)
            {
                for(int columnIndex=0; columnIndex<columns; columnIndex++)
                {
                    zerosArray[rowIndex][columnIndex] = 0;
                }
            }
            else
            {
                for(int columnIndex=0; columnIndex<columns; columnIndex++)
                {
                    if(zeroColumnIndex.contains(columnIndex))
                    {
                        zerosArray[rowIndex][columnIndex] = 0;
                    }
                    else {
                        zerosArray[rowIndex][columnIndex] = 1;
                    }

                }
            }
        }

        return zerosArray;
    }
}
