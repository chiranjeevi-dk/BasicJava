package Training_June04;

import java.util.Scanner;

public class bintreeFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int root = sc.nextInt();
        int n1=1,n2=1,n3,time =0;
        System.out.print(root- time+ ":1 ");
        time++;
        System.out.print(root-time + ":1 ");
        time++;
        for(int i=2;i<root;i++)
        {
            n3=n1+n2;
            System.out.print(root-time +":"+n3+" ");
            n1=n2;
            n2=n3;
            time++;
        }
    }
}
