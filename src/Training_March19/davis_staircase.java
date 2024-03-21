package Training_March19;
import java.io.*;
import java.util.stream.*;
class Result {
    public static int stepPerms(int n) {
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
        else if (n==2) {
            return 2;
        }
        else if (n==3) {
            return 4;
        }
        else
        {
            int a = 1;
            int b = 2;
            int c = 4;
            for (int i = 4; i <= n; i++) {
                int temp = c;
                c = a + b + c;
                a = b;
                b = temp;
            }
            return c;
        }
    }
}
public class davis_staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt")); // Provide a valid file path here

        int s = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, s).forEach(sItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int res = Result.stepPerms(n);

                try {
                    bufferedWriter.write(String.valueOf(res));
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        bufferedWriter.close();
    }
}
