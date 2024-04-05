package ArrayRelated;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
public class MAX
{
    static int i=0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in array");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements to be added in array");
        for(i=0;i<num;i++)
            arr[i]=sc.nextInt();
        arrMax(arr);
    }
    private static void arrMax(int  [] arr)
    {
        int Max = arr[0];
        int secondMax = arr[0];
        for(i=1;i<arr.length;i++)
        {
            if(Max<arr[i])
             {
                secondMax=Max;
                Max=arr[i];
             }
            else if (arr[i] > secondMax && arr[i] < Max)
                secondMax = arr[i];
        }
        System.out.println("The Max element in the Array is : "+Max);
        System.out.println("The Second Max element in the Array is : "+secondMax);
    }
}
