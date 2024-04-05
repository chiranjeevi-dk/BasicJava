package Training_April5;
import java.util.Scanner;

public class StringToLowercaseConverter {

    public String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            result.append(c);
        }
        return result.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringToLowercaseConverter converter = new StringToLowercaseConverter();
        String output = converter.toLowerCase(input);
        System.out.println("Converted string: " + output);
        scanner.close();
    }
}
