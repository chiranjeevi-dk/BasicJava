package Training_June05;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class skeletonFreq {

    public static class UniqueCharacters {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the word :");
            String word = sc.nextLine();

            System.out.println("Enter the Number of strings in the array :");
            int arraySize = sc.nextInt();
            sc.nextLine();
            String[] skeleton = new String[arraySize];

            for(int i = 0; i < arraySize; i++) {
                skeleton[i] = sc.nextLine();
            }

            Set<Character> wordSet = new HashSet<>();

            for (char ch : word.toCharArray()) {
                wordSet.add(ch);
            }

            ArrayList<String> output = new ArrayList<>();
            for(int i = 0; i < arraySize; i++) {
                Set<Character> checkSet = new HashSet<>();
                for (char ch : skeleton[i].toCharArray()) {
                    if (ch != '-') checkSet.add(ch);
                }
                if (checkSet.equals(wordSet)) output.add(skeleton[i]);
            }

            System.out.println("Matching strings:");
            for (String match : output) {
                System.out.println(match);
            }
        }
    }
}
