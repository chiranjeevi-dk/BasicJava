package Training_March22;

import java.util.*;
public class StringFreq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int stringsCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Map<String, Integer> frequencyMap = new HashMap<>();
        System.out.println("Enter the strings:");
        for (int i = 0; i < stringsCount; i++) {
            String str = scanner.nextLine();
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        System.out.println("Enter the number of queries:");
        int queriesCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<String> queries = new ArrayList<>();
        System.out.println("Enter the queries:");
        for (int i = 0; i < queriesCount; i++) {
            queries.add(scanner.nextLine());
        }

        List<Integer> occurrences = new ArrayList<>();
        for (String query : queries) {
            occurrences.add(frequencyMap.getOrDefault(query, 0));
        }

        System.out.println("Occurrences:");
        for (int occurrence : occurrences) {
            System.out.println(occurrence);
        }

        scanner.close();
    }
}

