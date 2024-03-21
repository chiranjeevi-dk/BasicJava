package java_Basics;
import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;
class Prime
{
    void checkPrime(int ... x)
    {
        for (int i = 0; i < x.length; i++) {
            if(x[i]==1)
                continue;
            else if (x[i] == 2||x[i]==3)
                System.out.print(x[i]+" ");
            else if ((x[i] % 2 != 0)&&(x[i] % 3 != 0))
            {
                System.out.print(x[i]+" ");
            }
        }
        System.out.println();
    }
}
public class PrimeChecker {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());
            }
            if(overload)
                throw new Exception("Overloading not allowed");
        }
        catch(Exception e)
          {System.out.println(e);}
    }
}