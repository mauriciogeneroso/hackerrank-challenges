package com.hackerrank.thrirtydaysofcode.day29bitwise;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            int max = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if ((i & j) > max) {
                        if ((i & j) < k) {
                            max = i & j;
                        }
                    }
                }
            }
            System.out.println(max);
        }

        scanner.close();
    }
}

