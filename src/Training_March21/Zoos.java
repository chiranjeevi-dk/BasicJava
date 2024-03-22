package Training_March21;
import java.util.*;
public class Zoos {
        public static void main(String args[] ) throws Exception {
            Scanner s = new Scanner(System.in);
            String name = s.nextLine();
            int countz=0,counto=0;
            for(int i=0;i<name.length();i++)
            {
                if(name.charAt(i)=='z')
                    countz++;
                else
                    counto++;
            }
            double result = (double) counto /2 ;
            int roundedResult = (int) Math.ceil(result);
            System.out.println(roundedResult +" " + counto +" " + countz);
            if(countz==roundedResult)
                System.out.println("Yes");
            else
                System.out.println("No");


        }

}
