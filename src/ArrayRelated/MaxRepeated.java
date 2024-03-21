package ArrayRelated;

import java.util.Arrays;
import java.util.Scanner;

public class MaxRepeated
{
    private static int repnum;
    public static void main(String[] name)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array : ");
        int[] arr = new int[sc.nextInt()];

        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array you Entered : ");
        System.out.println(Arrays.toString(arr));
        MaxrepNum(arr);
    }

    private static void MaxrepNum(int[] arr)
    {
        int max = 0;
        int count = 0;
        for(int x =0; x< arr.length;x++)
        {
            for(int y=x+1 ; y< arr.length;y++)
            {
                if(arr[x]==arr[y])
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                count=0;
                repnum = arr[x];
            }
        }
        System.out.println(repnum);

    }
}
