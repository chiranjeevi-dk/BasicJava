package Training_June07;

import java.util.Arrays;
import java.util.Scanner;

public class RemDupInArray
{
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
        RemDup remDup = new RemDup();
        int[] arrayWithoutDuplicate = remDup.removeDuplicates(inputArray);
        System.out.println("The array Without Duplicate is : ");
        System.out.println(Arrays.toString(arrayWithoutDuplicate));
    }
}
class RemDup {
    public int[] removeDuplicates(int[] nums) {
        int left =1;
        for(int right=1;right<nums.length;right++)
        {
            if(nums[right] != nums[right-1])
            {
                nums[left]=nums[right];
                left++;
            }
        }
        int[] arrayWithoutDuplicate = new int[left];
        for(int i=0;i<left;i++)
        {
            arrayWithoutDuplicate[i] =nums[i];
        }
        return arrayWithoutDuplicate;
    }
}
