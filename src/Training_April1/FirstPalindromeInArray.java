package Training_April1;
import java.util.Arrays;
import java.util.Scanner;

public class FirstPalindromeInArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        int elements = sc.nextInt();
        sc.nextLine();
        String[] array = new String[elements];
        for(int k=0;k<elements;k++)
        {
            array[k]= sc.nextLine();
        }
        System.out.println(Arrays.toString(array));
        String result = firstPalindrome(array);
        System.out.println(result);
    }
        public static String firstPalindrome(String[] words) {

            for(int j=0;j<words.length;j++)
            {
                int start =0 , end = words[j].length()-1;
                boolean ans = true;
                for(int i=0;i<(words[j].length()/2);i++)
                {
                    if(words[j].charAt(start)==words[j].charAt(end))
                    {
                        start++;
                        end--;
                    }
                    else
                        ans = false;
                }
                if(ans==true)
                    return words[j];
            }
            return "";

    }
}
