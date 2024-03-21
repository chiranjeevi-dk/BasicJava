package java_Basics;

import java.io.*;
import java.util.Scanner;

public class PrintingAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char charValue = sc.next().charAt(0);
        for(char i = charValue ; ((i>='a'&&i<='z')||(i>='A'&&i<='Z') );i++)
            System.out.println(i);
       sc.close();

    }
}
