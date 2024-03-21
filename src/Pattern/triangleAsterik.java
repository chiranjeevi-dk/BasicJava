package Pattern;

import java.util.Scanner;

public class triangleAsterik
{
      static  int i,j;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(i=1;i<=size;i++,System.out.println())
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
        }
    }
}
