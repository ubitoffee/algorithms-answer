import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        int mod = m % n;
        int result = 0;

        if (n > m) {
            mod = m;
            int idx = s + m - 1;
            if (idx > n) {
                result = n - idx;
            } else {
                result = idx;
            }
        } else {
            if (m % n == 0) {
                if (s == 1) {
                    result = n;
                } else {
                    result = s - 1;
                }
            } else {
                int candid = s + (m % n) - 1;
                if (candid > n) {
                    result = n - candid;
                } else {
                    result = candid;
                }
            }
        }

        return Math.abs(result);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
