package com.hackerrank.ps.algorithms.warmup;

import java.util.Arrays;

public class AVeryBigArray {

    static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).sum();
    }
}
