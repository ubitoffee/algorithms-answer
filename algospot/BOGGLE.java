package com.ubitoffee;

import java.util.Scanner;

public class Main {

    private int[] dx = new int[]{ -1, -1, -1, 0, 0, 0, 0, 0 };
    private int[] dy = new int[]{ -1, 0, 1, 0, 0, 0, 0, 0 };

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        String[][] game = new String[arraySize][arraySize];
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(arraySize);
        for (int i = 0; i < arraySize; i++) {
            game[i] = scanner.nextLine().split("");
        }

        int testSize = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[][] testCases = new String[testSize][testSize];
        for (int i = 0; i < testSize; i++) {
            testCases[i] = scanner.nextLine().split("");
        }
    }

    public static
}
