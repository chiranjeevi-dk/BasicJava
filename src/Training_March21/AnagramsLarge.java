package Training_March21;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsLarge
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        input = input.toLowerCase();
        freqAlpha(input,input2);
    }

    private static void freqAlpha(String input, String input2)
    {
        char[] Alphabets = new char[26];
        int[] Alphanum = new int[26];
        char[] Alphabets1 = new char[26];
        int[] Alphanum1 = new int[26];
        for (int i = 0; i <26; i++) {
            Alphabets[i] = (char) ('a' + i);
        }
        for (int i = 0; i <26; i++) {
            Alphabets1[i] = (char) ('a' + i);
        }
        for(int i=0; i<input.length();i++)
        {
            int count =0;
            for(int j=0; j<26;j++)
            {
                if(input.charAt(i)==Alphabets[j])
                {
                    count++;
                    Alphanum[j]+=count;
                }
            }
        }
        for(int i=0; i<input2.length();i++)
        {
            int newCount =0;
            for(int j=0; j<26;j++)
            {
                if(input2.charAt(i)==Alphabets1[j])
                {
                    newCount++;
                    Alphanum1[j]+=newCount;
                }
            }
        }
        boolean isEqual = false;


            for (int i = 0; i < Alphanum.length; i++) {
                if (Alphanum[i] != Alphanum1[i]) {
                    isEqual = false; // Arrays have different elements
                    break;
                }
                else
                    isEqual=true;
            }
        System.out.println(Arrays.toString(Alphanum));
        System.out.println(Arrays.toString(Alphanum1));

        if (isEqual) {
            System.out.println("Anagrams");
        } else {
            System.out.println("notAnagrams");
        }
        for(int k=0;k<26;k++)
        {
            if(input.contains(Alphabets[k]+""))
                System.out.println(Alphabets[k] + "  " + Alphanum[k]);
        }
    }
}
