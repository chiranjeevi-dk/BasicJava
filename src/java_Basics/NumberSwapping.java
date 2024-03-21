package java_Basics;

import java.util.Scanner;

public class NumberSwapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to be swapped:");

        while (scan.hasNext())
        {
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();

            System.out.println("Before Swapping A: " + number1 + "  B: " + number2);
            System.out.println("Choose a method to be performed (1, 2, or 3): ");
            int methodChoice = scan.nextInt();

            switch (methodChoice)
            {
                case 1:
                    Swap_Arithmetic.swappingWithVariable(number1, number2);
                    break;
                case 2:
                    Swap_Arithmetic.swappingWithArithmetic(number1, number2);
                    break;
                case 3:
                    swappingWithoutVariable(number1, number2);
                    break;
                default:
                    System.out.println("Invalid choice. Enter 1, 2, or 3");
            }

            System.out.println("Enter two numbers to be swapped:");
        }
    }

    private static void swappingWithoutVariable(int number1, int number2) {
        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        System.out.println("After Swapping without variable A: " + number1 + "  B: " + number2);
    }
}

class Swapnum {
    protected static void swappingWithVariable(int number1, int number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After Swapping with variable A: " + number1 + "  B: " + number2);
    }
}

