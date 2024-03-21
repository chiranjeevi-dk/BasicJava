package Pattern;

import java.util.Scanner;

public class Omnitrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the letter O: ");
        int size = scanner.nextInt();

        printO(size);
    }

    static void printO(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=size; j++) {
                int mid = (size+1)/2;
                if (j == 1 || ((i==j)&&((i+j)<=size+1))  || j == size||((j>=mid)&&(i<=mid)&&(i!=1)) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || ((i==j)&&((i+j)<=size+1))  || j == size-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int mid = (size+1)/2;
                if (i==1 || (j==mid)  || i == size ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int mid = (size+1)/2;
                if (i==1 || (j==mid)  ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int mid = (size+1)/2;
                if (i==1 || j==1 || i==mid||((j==size)&&(i==size))||((j==size)&&(i<=mid)) ||((i==j)&&(i>mid)&&(j>mid)) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int mid = (size+1)/2;
                if (i==1 || (j==mid)  || i == size ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int mid = (size+1)/2;
                if (i==j || ((i+j)==size+1) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}