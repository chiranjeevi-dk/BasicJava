package Training_June11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayAddition {

    public ArrayList<Integer> addArrays(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        int sizeOfListA = listA.size();
        int sizeOfListB = listB.size();
        int maxSize = Math.max(sizeOfListA, sizeOfListB);

        // Initialize the result array with zeros
        ArrayList<Integer> resultList = new ArrayList<>(Collections.nCopies(maxSize, 0));
        int carry = 0;
        int indexListA = sizeOfListA - 1;
        int indexListB = sizeOfListB - 1;
        int currentIndex = maxSize - 1;

        // Add corresponding elements of listA and listB
        while (currentIndex >= 0) {
            int sum = carry;
            if (indexListA >= 0) sum += listA.get(indexListA--);
            if (indexListB >= 0) sum += listB.get(indexListB--);
            carry = sum / 10;
            resultList.set(currentIndex--, sum % 10);
        }

        // If there is a carry left, add it to the front
        if (carry != 0) {
            ArrayList<Integer> resultListWithCarry = new ArrayList<>(maxSize + 1);
            resultListWithCarry.add(carry);
            resultListWithCarry.addAll(resultList);
            return resultListWithCarry;
        }

        return resultList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the first list:");
        int sizeListA = scanner.nextInt();

        ArrayList<Integer> inputListA = new ArrayList<>(sizeListA);
        System.out.println("Enter the elements of the first list:");
        for (int i = 0; i < sizeListA; i++) {
            inputListA.add(scanner.nextInt());
        }

        System.out.println("Enter the number of elements in the second list:");
        int sizeListB = scanner.nextInt();

        ArrayList<Integer> inputListB = new ArrayList<>(sizeListB);
        System.out.println("Enter the elements of the second list:");
        for (int i = 0; i < sizeListB; i++) {
            inputListB.add(scanner.nextInt());
        }

        ArrayAddition arrayAddition = new ArrayAddition();
        ArrayList<Integer> result = arrayAddition.addArrays(inputListA, inputListB);

        System.out.println("Resultant list after adding:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
