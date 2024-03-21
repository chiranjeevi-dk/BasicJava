package Training_March21;

import java.util.Scanner;

class JewelsAndStones {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two strings");
        String jewels = sc.nextLine();
        String stones = sc.nextLine();
        int result = numJewelsInStones(jewels,stones);
        System.out.println(result);
    }
    private static int numJewelsInStones(String jewels, String stones)
    {
        int op = 0;
        for(int i=0;i<jewels.length();i++)
        {
            for(int j=0; j<stones.length(); j++)
            {
                if(jewels.charAt(i)==stones.charAt(j))
                {
                    op++;
                }
            }
        }
        return op;
    }
}
