package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {
    // n >= 2 && n <= 20 CHECK

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        getOutput(N);
    }

    public static void getOutput(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n +" x "+ i + " = "+ result);
        }
    }
}
