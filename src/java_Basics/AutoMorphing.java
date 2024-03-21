package java_Basics;

import java.util.Scanner;

public class AutoMorphing {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        boolean f=true;
        while(n!=0)
        {
            int oLast=n%10;
            int sqLast= sq%10;
            if(oLast!=sqLast)
            {
                f=false;
                break;
            }
            n/=10;
            sq/=10;
        }
        if(f)
        {
            System.out.print("Auto");
        }
        else
            System.out.println("Non");
    }
}
