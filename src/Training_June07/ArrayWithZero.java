package Training_June07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array");
        int arraySize = sc.nextInt();
        int[] inputArray = new int[arraySize];
        System.out.println("Enter the  elements in Array");
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = sc.nextInt();
        }
        System.out.println("The given array is : ");
        System.out.println(Arrays.toString(inputArray));
        int opArray[] = arrayWithZero(inputArray);
        System.out.println("The output array with zeros at the end :");
        System.out.println(Arrays.toString(opArray));
    }
    static int[] arrayWithZero(int[] array)
    {
        int nonZeroIndex =0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=0)
            {
                array[nonZeroIndex]=array[i];
                nonZeroIndex++;
            }
        }
        for(int i=nonZeroIndex;i< array.length;i++) array[i]=0;


        return array;
    }
}
