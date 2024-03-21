package ArrayRelated;

import java.util.Arrays;
import java.util.Scanner;

public class FrontAndBackSum
{
    public static void main(String[] name)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array : ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Now enter "+arr.length+" number of elements to be added in array: ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array you Entered : ");
        System.out.println(Arrays.toString(arr));
        frontAndBack(arr);
    }

    private static void frontAndBack(int[] arr)
    {
        for(int i=0,j=i+1;i< arr.length;i++)
        {
            if(i==0)
                arr[i]=arr[j];
             else if (i== arr.length-1)
            {
                arr[i]=arr[i-1];
            }
             else
                 arr[i]=arr[i-1]+arr[i+1];
        }
        System.out.println("Array after interchanging : ");
        System.out.println(Arrays.toString(arr));
    }

}
