package Training_March21;
import java.util.*;
public class Zoos {


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail


        public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
                       // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

            // Write your code here
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
