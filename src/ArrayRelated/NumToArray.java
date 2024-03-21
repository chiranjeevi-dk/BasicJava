package ArrayRelated;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be converted as string:");
        while (true) {
            try {
                int number = sc.nextInt();
                NumberArrayConverter converter = new NumberArrayConverter(number);
                int[] reversedArray = converter.getReversedArray();
                System.out.println("The elements in the Array after reversing are : ");
                System.out.println(Arrays.toString(reversedArray));
                System.out.println();
                System.out.println("Enter the number to be changed to an array : ");
                }
            catch (InputMismatchException e)
            {
                // Handle input mismatch exception
                System.out.println("Invalid input! Please enter a valid integer.\n");
                System.out.println("Enter the number to be changed to an array : ");
                sc.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        }
    }
}
class NumberArrayConverter {
    private int number;
    public NumberArrayConverter(int number) {
        this.number = number;
    }
    public int[] getReversedArray() {
        int copy = number;

        int digit = 0;
        while (copy != 0) {
            copy = copy / 10;
            digit++;
        }
        int[] array = new int[digit];
        for (int i = 0; i < digit; i++) {
            int num = 0;
            num = number % 10;
            array[i] = num;
            number = number / 10;
        }
        int start = 0;
        int end = array.length - 1;
        while ( start < end )
        {
            array[start] = array[start] ^ array[end];
            array[end] = array[start] ^ array[end];
            array[start] = array[start] ^ array[end];
            start++;
            end--;
        }
        return array;
    }
}