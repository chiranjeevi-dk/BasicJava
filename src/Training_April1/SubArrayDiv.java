package Training_April1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static int birthday(List<Integer> s, int d, int m) {
        int birthday = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                birthday++;
            }
        }
        return birthday;
    }
}

public class SubArrayDiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = scanner.nextInt();
        System.out.println("Enter the " + n + " of elements in the array : ");
        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = scanner.nextInt();
            s.add(sItem);
        }
        System.out.println("Enter the sum :");
        int d = scanner.nextInt();
        System.out.println("Enter the month :");
        int m = scanner.nextInt();

        int result = Result.birthday(s, d, m);

        System.out.println(result);

        scanner.close();
    }
}
