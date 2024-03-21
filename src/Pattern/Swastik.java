package Pattern;
import java.util.Scanner;
public class Swastik
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int mid =(num+1)/2;
        System.out.println(mid);
      for(int i=1;i<=num;i++,System.out.println())
      {
          for(int j=1;j<=num;j++)
          {
              if((i==mid)||(j==mid)||((j==1)&&((i+j)<=mid))||((j==num)&&(i>=mid))||((i==num)&&(j<=mid))||((i==1)&&((i+j)>mid)))
              {
                  System.out.print("* ");
              }
              else
                 System.out.print("  ");
          }
      }
    }
}
