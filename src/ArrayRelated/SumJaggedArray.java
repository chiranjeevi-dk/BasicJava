package ArrayRelated;

import java.util.Arrays;
import java.util.Scanner;

public class SumJaggedArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Arrays needed");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];
        for(int i=0;i<rows;i++)
        {
            System.out.println("Enter the number of columns you need for : "+i+"th array");
            arr[i] = new int[sc.nextInt()];
        }

        System.out.println("Enter the values you need in the array ");

        for(int a=0;a< arr.length;a++)
        {
            for (int b=0;b<arr[a].length;b++)
            {
                arr[a][b] = sc.nextInt();
            }
        }

        System.out.println("The 2d jagged array you created : ");
        for(int a=0;a< arr.length;a++)
        {System.out.println(Arrays.toString(arr[a]));
        }
        SumOfArr(arr);
    }

    private static void SumOfArr(int[][] arr)
    {
        int sum =0 ;
        int max= Integer.MIN_VALUE ;
        for(int x=0;x< arr.length;x++)
        {
            for(int y=0;y<arr[x].length;y++)
            {
                sum +=arr[x][y];
            }
            if(sum>max)
            {
                max=sum;
            }
            sum=0;
        }


        System.out.println("The Max value of the Array of all 2d jagged array  is : "+max);
    }

}
