package ArrayRelated;
import java.util.Arrays;
import java.util.Scanner;



public class ArrayConCat
{
    static Scanner sc = new Scanner(System.in);
    static int i=0;
    public static void main(String[] args)
    {
        System.out.println("Enter the size of array 1 and 2");
        int[]  arr1 = new int[sc.nextInt()];
        int[]  arr2 = new int[sc.nextInt()];
        System.out.println("Enter the elements in array 1");
        for(i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the elements in array 2");
        for(i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int[] arr3 = new int[arr1.length+arr2.length];
        for(i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];
        }
        for(int i= arr1.length,j=0;i<arr3.length;i++,j++)
            arr3[i] = arr2[j];
        System.out.println("The elements in array 3 after concatination of array1 and array2");
        System.out.println(Arrays.toString(arr3));
    }
}
