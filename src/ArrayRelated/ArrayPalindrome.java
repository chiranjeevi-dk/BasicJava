package ArrayRelated;
//Dec 31 morning 8.40am finished this
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of elements to be added in the Array :  ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the element to be added in the array :  ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("The Array you entered : "+ Arrays.toString(arr)+"\n");
        ArrayPalindrome ob = new ArrayPalindrome();
        System.out.println("Choose which Approach do you need to run :  \n 1.TWO POINTER \n 2.RECURSIVE  ");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 :
                      System.out.println("Implementing TWO POINTER APPROACH : \n");
                      System.out.println(ob.ArrPalindrome(arr) ? "The array you entered is Palindrome Array": "the array you entered is not a Palindrome Array");
                      break;
            case 2 :
                      System.out.println("Implementing RECURSIVE APPROACH : \n");
                      System.out.println(ob.ArrPalindrome(arr,0, arr.length-1) ? "The array you entered is Palindrome Array": "the array you entered is not a Palindrome Array");
                      break;
            default:
                System.out.println("Fuck you im doing both approach\n");
                System.out.println("Implementing TWO POINTER APPROACH :");
                System.out.println(ob.ArrPalindrome(arr) ? "The array you entered is Palindrome Array": "the array you entered is not a Palindrome Array");
                System.out.println("\n Implementing RECURSIVE APPROACH : ");
                System.out.println(ob.ArrPalindrome(arr,0, arr.length-1) ? "The array you entered is Palindrome Array": "the array you entered is not a Palindrome Array");
                break;
        }

    }

    private boolean ArrPalindrome(int[] array)
    {
        int start = 0;
        int end = array.length-1;

        while(start<end)
        {
            if(array[start]!=array[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
    protected boolean ArrPalindrome(int[] array,int start,int end)
    {
        if(start>=end)
            return true;
        if(array[start]!=array[end])
            return false;
        return ArrPalindrome(array,start+1,end-1);
    }
}
