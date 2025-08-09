package com.generoso.hackerrank.problemsolving.warmup;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        IntStream intStream = Arrays.stream(arr);

        double positives = intStream.filter(a -> a > 0).count();
        double negatives = intStream.filter(a -> a < 0).count();
        double zeros = intStream.filter(a -> a == 0).count();

        System.out.printf("%.6f\n", positives / arr.length);
        System.out.printf("%.6f\n", negatives / arr.length);
        System.out.printf("%.6f\n", zeros / arr.length);
    }

    static void plusMinus2(int[] arr) {
        double positives = 0;
        double negatives = 0;
        double zeroes = 0;

        for (int value : arr) {
            if (value > 0) {
                positives++;
            } else if (value < 0) {
                negatives++;
            } else {
                zeroes++;
            }
        }

        System.out.println(positives / arr.length);
        System.out.println(negatives / arr.length);
        System.out.println(zeroes / arr.length);
    }
}
