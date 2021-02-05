package com.hackerrank.ps.algorithms.warmup;

import java.util.Arrays;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long minimum = 0;
        long maximum = 0;
        long tempSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    tempSum += arr[j];
                }
            }

            if (i == 0) {
                minimum = maximum = tempSum;
            } else {
                if (tempSum > maximum) {
                    maximum = tempSum;
                }
                if (tempSum < minimum) {
                    minimum = tempSum;
                }
            }
            tempSum = 0;
        }

        System.out.printf("%d %d", minimum, maximum);
    }

    static void miniMaxSum2(int[] arr) {
        Arrays.sort(arr);
        long min = 0, max = 0;
        for(int i = 0, j = arr.length - 1; i < arr.length - 1; i++, j--){
            max = max + arr[j];
            min = min + arr[i];
        }
        System.out.println(min + " " + max);
    }
}
