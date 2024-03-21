package Training_March18;

import java.util.*;
public class vowelsFirst
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string : ");
        String name = sc.nextLine();
      //  arrangeVowels(name);
        arrangeOptimized(name);

    }

    private static void arrangeOptimized(String name)
    {
        String vowels = "aieouAEIOU";
        String vow="";
        String cons="";
        for(char c:name.toCharArray())
        {
            if(vowels.contains(c+""))
            {
                vow+=c;
            }
            else
                cons+=c;
        }
        System.out.println(vow+cons);
    }

    private static void arrangeVowels(String name)
    {
        name = name.toLowerCase();
        char[] Alphabets = name.toCharArray();
        char[] ArrangedVowels = new char[Alphabets.length];
        int j=0;
        for(int i=0;i<Alphabets.length;i++)
        {
            if(Alphabets[i]=='a'||Alphabets[i]=='e'||Alphabets[i]=='i'||Alphabets[i]=='o'||Alphabets[i]=='u')
            {
                ArrangedVowels[j]=Alphabets[i];
                j++;
            }
        }
        for(int i =0;i< Alphabets.length;i++)
        {
            if(Alphabets[i] != 'a'&&Alphabets[i] != 'e'&&Alphabets[i] != 'i'&&Alphabets[i] != 'o'&&Alphabets[i] != 'u')
            {
                ArrangedVowels[j]=Alphabets[i];
                j++;
            }
        }
        String ArrangedName = new String(ArrangedVowels);
        System.out.println(ArrangedName);
    }

}

