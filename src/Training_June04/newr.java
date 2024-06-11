package Training_June04;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class newr {

    public class UniqueCharacters {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the word :");
            String word = sc.nextLine();

            System.out.println("Enter the Number of strings in the array :");
            int arraySize = sc.nextInt();

            String skeleton[] = new String[arraySize];

            for(int i =0;i<arraySize;i++)
            {
                skeleton[i] = sc.nextLine();
            }

            Set<Character> wordSet = new HashSet<>();

            for (char ch : word.toCharArray()) {
                wordSet.add(ch);
            }
            ArrayList<String> output = new ArrayList<>();
            for(int i=0;i<arraySize;i++)
            {
                Set<Character> checkSet = new HashSet<>();
                for (char ch : skeleton[i].toCharArray()) {
                    if(ch!= '-') checkSet.add(ch);
                }
                if(checkSet==wordSet) output.add(skeleton[i]);

            }

            for (String fruit : output) {
                System.out.println(fruit);
            }

        }
    }

}
