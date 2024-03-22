package Training_March22;

import java.util.*;

class Result {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        ArrayList<Integer> result = new ArrayList<>(queries.size());

        for(String query : queries) {
            int count = 0;
            for(String str : strings) {
                if(query.equals(str))
                    count++;
            }
            result.add(count);
        }
        return result;
    }
}

public class SparseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int stringsCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<String> strings = new ArrayList<>();
        System.out.println("Enter the strings:");
        for(int i = 0; i < stringsCount; i++) {
            strings.add(scanner.nextLine());
        }

        System.out.println("Enter the number of queries:");
        int queriesCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<String> queries = new ArrayList<>();
        System.out.println("Enter the queries:");
        for(int i = 0; i < queriesCount; i++) {
            queries.add(scanner.nextLine());
        }

        List<Integer> res = Result.matchingStrings(strings, queries);

        System.out.println("Results:");
        for(Integer count : res) {
            System.out.println(count);
        }

        scanner.close();
    }
}

