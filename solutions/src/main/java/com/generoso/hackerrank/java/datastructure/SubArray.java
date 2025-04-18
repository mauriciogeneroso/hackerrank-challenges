package com.generoso.hackerrank.java.datastructure;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfElements = scan.nextInt();

        int[] array = new int[numberOfElements];
        IntStream.range(0, numberOfElements).forEach(i -> array[i] = scan.nextInt());

        int negativeSubarrayCount = 0;
        for (int start = 0; start < numberOfElements; start++) {
            int sum = 0;
            for (int end = start; end < numberOfElements; end++) {
                sum += array[end];
                if (sum < 0) {
                    negativeSubarrayCount++;
                }
            }
        }

        System.out.println(negativeSubarrayCount);
        scan.close();
    }
}
