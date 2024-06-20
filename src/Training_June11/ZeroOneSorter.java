package Training_June11;
//https://www.interviewbit.com/problems/segregate-0s-and-1s-in-an-array/
import java.util.ArrayList;
import java.util.Scanner;
//https://www.interviewbit.com/problems/segregate-0s-and-1s-in-an-array/
public class ZeroOneSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int size = scanner.nextInt();

        ArrayList<Integer> inputList = new ArrayList<>(size);
        System.out.println("Enter the elements of the list (only 0s and 1s):");
        for (int i = 0; i < size; i++) {
            inputList.add(scanner.nextInt());
        }

        ZeroOneSorter sorter = new ZeroOneSorter();
        ArrayList<Integer> sortedList = sorter.sortZeroesAndOnes(inputList);

        System.out.println("Sorted list:");
        for (int value : sortedList) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }

    public ArrayList<Integer> sortZeroesAndOnes(ArrayList<Integer> inputList) {
        int size = inputList.size();
        ArrayList<Integer> sortedList = new ArrayList<>(size);

        // Initialize the sorted list with placeholder values
        for (int i = 0; i < size; i++) {
            sortedList.add(0);
        }

        int zeroIndex = 0;
        int oneIndex = size - 1;

        for (int i = 0; i < size; i++) {
            if (inputList.get(i) == 0) {
                sortedList.set(zeroIndex, 0);
                zeroIndex++;
            } else if (inputList.get(i) == 1) {
                sortedList.set(oneIndex, 1);
                oneIndex--;
            }
        }

        return sortedList;
    }
}
