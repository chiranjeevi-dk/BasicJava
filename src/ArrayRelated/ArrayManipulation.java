package ArrayRelated;
import java.io.IOException;
import java.util.Scanner;

public class ArrayManipulation
{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements needed in an array");
        while(sc.hasNext())
        {
            int ArrayNum =sc.nextInt();
            int[] arr = new int[ArrayNum];
            System.out.println("Enter the elements in array");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the operation to be done");
            while(sc.hasNext())
            {
                int choice = sc.nextInt();
                switch (choice)
                {
                    case 0 : arraySum(arr);
                        break;
                    case 1 : oddIndexSumWithIf(arr);
                        break;
                    case 2 : oddIndexWithoutIf(arr);
                        break;
                    case 3 : oddValueSum(arr);
                        break;
                    case 4 : oddIndexEvenValue(arr);
                        break;
                    case 5 : findSumOfFactors(arr);
                        break;
                }
                System.out.println("Enter the operation to be done");
            }


    }
}

    private static void findSumOfFactors(int[] arr) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked for factors");
        int value=sc.nextInt();
        int sum=0;
        try{for(int i=0;i<arr.length;i++){
            if(value % arr[i]==0)
                sum=sum+arr[i];
        }
            System.out.println("The sum of the factors of the given Number : " + value + " is : "+sum);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close(); // Close the scanner in the finally block
        }

    }

    private static void oddIndexEvenValue(int[] arr)
    {
        int sum =0;
        for( int i =1; i<arr.length;i=i+2)
        {
            if(arr[i]%2==0)
            {
                sum = sum + arr[i];
            }
        }
        System.out.println("The sum of the array odd index which has even values is :"+ sum);
    }

    private static void oddValueSum(int[] arr)
    {
        int sum = 0 ;
        for(int i =0 ; i<arr.length;i++)
        {
          if(arr[i]%2!=0)
          {
              sum = sum + arr[i];
          }
        }
        System.out.println("The sum of the array odd values is :"+ sum);
    }

    private static void oddIndexWithoutIf(int[] arr)
    {
        int sum =0;
        for( int i =1; i<arr.length;i=i+2)
        {
            sum = sum + arr[i];
        }
        System.out.println("The sum of the array odd index without if is :"+ sum);
    }

    private static void oddIndexSumWithIf(int[] arr)
    {
        int sum =0;
        for(int i=0;i< arr.length;i++)
        {
            if(i%2!=0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println("The sum of the array odd index with if is :"+ sum);
    }



    private static void arraySum(int[] arr)
    {
        int sum =0;
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("The sum of the array is :"+ sum);
    }

}
