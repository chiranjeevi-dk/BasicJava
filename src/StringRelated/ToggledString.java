package StringRelated;
import java.util.Scanner;
public class ToggledString
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The string : ");
        String input = scan.nextLine();
        char[] CharArr = input.toCharArray();
        for(int i=0;i< CharArr.length;i++)
        {
            if((CharArr[i]>=65)&&(CharArr[i]<=90))
                CharArr[i]= (char) (CharArr[i]+32);
            else if ((CharArr[i]>=97)&&(CharArr[i]<=122))
                CharArr[i]= (char) (CharArr[i]-32);
        }
        input = new String(CharArr);
        System.out.println("THE TOGGLED STRING OF THE INPUT STRING IS : "+input);
    }
}
