package StringRelated;
import java.util.Scanner;
public class VowelsReplacement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String originalString = scan.nextLine();
        String modifiedString = removeVowels(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
    private static String removeVowels(String input) {
        // Define the set of vowels (both uppercase and lowercase)
        String vowels = "aeiouAEIOU";

        // Create a char array to build the modified string
        char[] resultArray = new char[input.length()];
        int resultIndex = 0;
        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) == -1) {
                resultArray[resultIndex++] = ch;
            }
        }
        return new String(resultArray, 0, resultIndex);
    }
}

