package Training_June05;
import java.util.Scanner;

public class maxContigous
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        int arrsize = sc.nextInt();
        int[] arr = new int[arrsize];
        for (int i=0;i<arrsize;i++)
        {
            arr[i] = sc.nextInt();
        }
            int sum = 0;
            int maxsum =arr[0];
        for(int i=0;i<arrsize;i++)
        {
             sum+=arr[i];
             if(sum>maxsum)
                maxsum=sum;
             if(sum<0)
                 sum=0;
        }
        System.out.println(maxsum);
    }
}
