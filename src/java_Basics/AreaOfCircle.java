package java_Basics;
import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE DIAMETER FOR THE CIRCLE : ");
        while(sc.hasNext())
        {
            int diameter=sc.nextInt();
            double radius = diameter/2.0;
            double area = (22.0/7.0)*radius*radius;
            System.out.println("THE AREA OF THE CIRCLE IS : "+ area);
            System.out.println();
            System.out.println("ENTER THE DIAMETER FOR THE CIRCLE : ");
        }

    }
}
