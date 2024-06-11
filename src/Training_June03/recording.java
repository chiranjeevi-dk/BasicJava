package Training_June03;

import java.util.Scanner;

public class recording
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        int array_size = sc.nextInt();
        char[] chararr = new char[array_size];

        System.out.println("Enter the char:");
        for (int i = 0; i < array_size; i++) {
            chararr[i] = sc.next().toLowerCase().charAt(0);
        }
        record(chararr,chararr.length);
    }
    static void record(char[] chararr, int arr_size)
{
    int count =0;
    char current= chararr[0];
    for(int i=1;i<arr_size;i++)
    {
        if(current!=chararr[i])
        {
            current=chararr[i];
            count++;

        }
    }
    System.out.println(count);
}
}

