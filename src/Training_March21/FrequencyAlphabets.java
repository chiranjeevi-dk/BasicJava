package Training_March21;
import java.util.Scanner;
public class FrequencyAlphabets
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input = sc.nextLine();
        input = input.toLowerCase();
        freqAlpha(input);
    }

    private static void freqAlpha(String input)
    {
        char[] Alphabets = new char[26];
        int[] Alphanum = new int[26];
        for (int i = 0; i <26; i++) {
            Alphabets[i] = (char) ('a' + i);
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
        for(int k=0;k<26;k++)
        {
            if(input.contains(Alphabets[k]+""))
               System.out.println(Alphabets[k] + "  " + Alphanum[k]);
        }
    }
}
