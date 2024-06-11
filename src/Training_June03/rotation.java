package Training_June03;
import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        int array_size = scanner.nextInt();
        int[] array1 = new int[array_size];
        int[] array2 = new int[array_size];
        System.out.println("Enter the array1 elements :");
        for (int i = 0; i < array_size; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Enter the array2 elements :");
        for (int i = 0; i < array_size; i++) {
            array2[i] = scanner.nextInt();
        }
       rotate(array1,array2, array_size);

    }

    static void rotate(int[] array1, int[] array2, int array_size){
       int[] output = new int[array_size];
       int index =0;
        for(int times=0;times<array_size;times++)
        {
            int temp = array1[0];
            for(int i=0;i<array_size-1;i++)
            {
                array1[i]=array1[i+1];
            }
            array1[array_size-1]=temp;
            int sum=0;
            for(int i=0;i<array_size;i++)
            {
             sum += Math.abs(array1[i]-array2[i]);
            }
            output[index++]=sum;
        }

        for(int i=0;i<array_size;i++)
        {
            System.out.print(output[i] + " ");
        }

        }
}
