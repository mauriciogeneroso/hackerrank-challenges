package com.generoso.hackerrank.problemsolving.warmup;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        int sum = 0;

        for (int j : ar) {
            sum += j;
        }

        return sum;
    }

    static int simpleArraySum1(int[] ar) {
        return Arrays.stream(ar).sum();
    }

    static int simpleArraySum2(int[] ar) {
        return IntStream.of(ar).sum();
    }
}
