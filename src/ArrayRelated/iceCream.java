package ArrayRelated;

import java.util.Arrays;
import java.util.Scanner;

public class iceCream
{
    static  Scanner sc = new Scanner(System.in);
    static int i =0,j=0;

    public static void main(String[] args)
    {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nonZeroIndex=0;
        int num=2;
        int number =1;
        int[] array = new int[n];
        for(i=0,j=1;i<n;i++,j++)
        {  array[i] = j;}
        System.out.println(Arrays.toString(array));
        for ( i = 0; i < n; i++) {
            if ((array[i]%2)!= 0) {
                array[nonZeroIndex] = number;
                nonZeroIndex++;
                number=number+2;
            }
        }
        for ( i = nonZeroIndex; i < n; i++)
        {
            array[i] = num;
            num=num+2;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[k-1]);
        sc.close();
    }

}
