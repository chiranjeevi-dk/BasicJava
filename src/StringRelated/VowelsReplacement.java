package StringRelated;
import java.util.Scanner;
public class VowelsReplacement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        // Original string
        String originalString = scan.nextLine();

        // Remove vowels from the string
        String modifiedString = removeVowels(originalString);

        // Print the modified string
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    private static String removeVowels(String input) {
        // Define the set of vowels (both uppercase and lowercase)
        String vowels = "aeiouAEIOU";

        // Create a char array to build the modified string
        char[] resultArray = new char[input.length()];
        int resultIndex = 0;

        // Iterate through each character of the input string
        for (char ch : input.toCharArray()) {
            // Check if the character is not a vowel
            if (vowels.indexOf(ch) == -1) {
                // Assign the character to the result array
                resultArray[resultIndex++] = ch;
            }
        }

        // Create a new string with the non-vowel characters
        return new String(resultArray, 0, resultIndex);
    }
}

