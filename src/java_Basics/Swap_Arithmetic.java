package java_Basics;

public class Swap_Arithmetic extends Swapnum {
     static void swappingWithArithmetic(int number1, int number2) {
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("After Swapping with arithmetic A: " + number1 + "  B: " + number2);
    }
}
