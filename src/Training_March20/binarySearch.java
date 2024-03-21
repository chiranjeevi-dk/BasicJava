package Training_March20;
import java.util.Arrays;
import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int elements = sc.nextInt();
        int[] arr = new int[elements];
        for(int i=0;i<elements;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("The Array you entered : "+ Arrays.toString(arr)+"\n");
        System.out.println("Enter the number to find the index");
        int value = sc.nextInt();
        int result;
        result = binSearch(arr,value);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
    private static int binSearch(int[] arr, int value) {
        int start =0,end=arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == value)
                return mid;

            if (arr[mid] < value)
                start = mid + 1;

            else
                end = mid - 1;
        }
        return -1;
    }
}
