package com.generoso.hackerrank.thrirtydaysofcode.day7arrays;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.printf("%d", arr[i]);
            } else {
                System.out.printf("%d ", arr[i]);
            }
        }

        scanner.close();
    }
}
