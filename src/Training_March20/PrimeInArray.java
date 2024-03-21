package Training_March20;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeInArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array");
        int ArrayNum =sc.nextInt();
        int[] arr = new int[ArrayNum];
        System.out.println("Enter the elements in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        primeInArray(arr);
    }

    private static void primeInArray(int[] arr) {
        int index =0;
        int[] primeArray = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {

        }
        System.out.println(Arrays.toString(primeArray));
    }
}
