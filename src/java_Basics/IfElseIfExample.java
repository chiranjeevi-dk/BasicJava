package java_Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseIfExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = bufferedReader.readLine()) != null) {
            int N = Integer.parseInt(input.trim());

            if (N % 2 != 0 || (N % 2 == 0 && N >= 6 && N <= 20)) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && (N >= 2 && N <= 5 || N > 20)) {
                System.out.println("Not Weird");
            }
        }

        bufferedReader.close();
    }
}
