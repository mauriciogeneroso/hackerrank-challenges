package com.hackerrank.thrirtydaysofcode.day6letsreview;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        String word;
        for (int i = 0; i < t; i++) {
            word = scanner.next();

            int length = word.length();
            char[] even = new char[length % 2 == 0 ? length / 2 : (length / 2) + 1];
            char[] odd = new char[length / 2];
            int evenSize = 0;
            int oddSize = 0;

            for (int j = 0; j < length; j++) {
                if (j % 2 == 0) {
                    even[evenSize++] = word.charAt(j);
                } else {
                    odd[oddSize++] = word.charAt(j);
                }
            }

            for (int j = 0; j < evenSize; j++) {
                System.out.print(even[j]);
            }

            System.out.print(" ");

            for (int j = 0; j < oddSize; j++) {
                System.out.print(odd[j]);
            }

            System.out.println();
        }
    }
}
