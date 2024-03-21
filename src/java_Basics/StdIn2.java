package java_Basics;

import java.io.*;
import java.util.*;

public class StdIn2 {


        public static void main(String[] args) throws IOException {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            //here i have used bufferedreader so that i havent faced any issues
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int Int =   Integer.parseInt(bufferedReader.readLine().trim());
            double Dou = Double.parseDouble(bufferedReader.readLine().trim());
            String str = bufferedReader.readLine();

            System.out.println("String: "+str);
            System.out.println("Double: "+Dou);
            System.out.println("Int: "+Int);


            bufferedReader.close();


        }
    }


