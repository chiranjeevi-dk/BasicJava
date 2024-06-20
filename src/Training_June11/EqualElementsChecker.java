package Training_June11;
//https://www.interviewbit.com/problems/make-equal-elements-array/
import java.util.ArrayList;
import java.util.Scanner;

public class EqualElementsChecker {
    public int canMakeAllElementsEqual(ArrayList<Integer> elements, int x) {
        int firstElement = elements.get(0);
        int target1 = firstElement;
        int target2 = firstElement + x;
        int target3 = firstElement - x;

        boolean canMakeEqualToTarget1 = true;
        boolean canMakeEqualToTarget2 = true;
        boolean canMakeEqualToTarget3 = true;

        for (int element : elements) {
            if (element != target1 && element + x != target1 && element - x != target1) {
                canMakeEqualToTarget1 = false;
            }
            if (element != target2 && element + x != target2 && element - x != target2) {
                canMakeEqualToTarget2 = false;
            }
            if (element != target3 && element + x != target3 && element - x != target3) {
                canMakeEqualToTarget3 = false;
            }
            if (!canMakeEqualToTarget1 && !canMakeEqualToTarget2 && !canMakeEqualToTarget3) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int numberOfElements = scanner.nextInt();

        ArrayList<Integer> elements = new ArrayList<>(numberOfElements);
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < numberOfElements; i++) {
            elements.add(scanner.nextInt());
        }

        System.out.println("Enter the value of x:");
        int x = scanner.nextInt();

        EqualElementsChecker checker = new EqualElementsChecker();
        int result = checker.canMakeAllElementsEqual(elements, x);

        System.out.println("Output: " + result);

        scanner.close();
    }
}
