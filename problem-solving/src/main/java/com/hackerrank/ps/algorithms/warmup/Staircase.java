package com.hackerrank.ps.algorithms.warmup;

import java.util.Arrays;

public class Staircase {

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < i; j++) {
                row.append("#");
            }
            System.out.printf("%" + n + "s\n", row.toString());
        }
    }

    static void staircase2(int n) {
        char[] row = new char[n];
        Arrays.fill(row, ' ');

        for (int i = 1; i <= n; i++) {
            row[row.length - i] = '#';
            System.out.println(row);
        }
    }
}
