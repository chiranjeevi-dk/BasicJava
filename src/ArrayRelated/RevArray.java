package ArrayRelated;

import java.util.Arrays;
import java.util.Scanner;

public class RevArray
{
    public static void main(String[] args) {
        int[] Arr ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        while(sc.hasNext())
        {
            int count = sc.nextInt();
            Arr = new int[count];
            for(int i=0;i<count;i++)
            {
                Arr[i]= sc.nextInt();
            }
            System.out.println("The elements in the Array are :");
            System.out.println(Arrays.toString(Arr));
            System.out.println("Enter the Operation to be done");
            while(sc.hasNext())
            {
                int option = sc.nextInt();
                switch (option)
                {
                    case 1 : int index1,index2;
                        System.out.println("Enter The index 14" +
                                " and 2 for swapping");
                        index1=sc.nextInt();
                        index2=sc.nextInt();
                        Swap(Arr, index1, index2);
                        break;

                    case 2 : revArray(Arr);
                        break;

                }
                System.out.println("Enter the Operation to be done");
            }

        }
    }


    public static void revArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
           // int temp = arr[end];// arr[end] = arr[start];
           // arr[start] = temp;
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[start]^arr[end];
            arr[start]=arr[start]^arr[end];
            start++;
            end--;
        }
        System.out.println("The elements in the Array after reversing are :");
        System.out.println(Arrays.toString(arr));
    }

    private static void Swap(int[] soothu, int index1, int index2)
    {
         soothu[index1]=soothu[index1]^soothu[index2];
         soothu[index2]=soothu[index1]^soothu[index2];
         soothu[index1]=soothu[index1]^soothu[index2];
         System.out.println("The elements in the Array are :");
         System.out.println(Arrays.toString(soothu));

    }

}
