package ArrayRelated;
//https://www.interviewbit.com/problems/spiral-order-matrix-i/
import java.util.Arrays;
import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int rows = sc.nextInt();
        System.out.print("enter number of Columns:");
        int columns = sc.nextInt();
        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid input: Rows and columns must be greater than 0.");
            sc.close();
            return;
        }
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the value of elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] spiralMatrix = spiralOrderMatrix(matrix,rows,columns);

        System.out.println("\nThe Spiral Matrix is:");
        System.out.println(Arrays.toString(spiralMatrix));

    }

    static int[] spiralOrderMatrix(int[][] matrix,int rows,int columns)
    {
      int[] spiralMatrix = new int[rows * columns];
      int top = 0, bottom = rows-1, right = columns-1, left = 0;
      int index =0;
      while( top <= bottom && left <= right )
      {
          for(int i = left; i <= right; i++)
          {
              spiralMatrix[index++] = matrix[left][i];
          }
          top++;

          for(int i = top; i <= bottom; i++)
          {
              spiralMatrix[index++] = matrix[i][right];
          }
          right--;

          for(int j = right; j >= left; j--)
          {
              spiralMatrix[index++] = matrix[bottom][j];
          }
          bottom--;

          for(int i = bottom; i >= top; i--)
          {
              spiralMatrix[index++] = matrix[i][left];
          }
          left++;
      }
      return spiralMatrix;
    }
}
