package com.generoso.hackerrank.tendaysofstatistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day0MeanMedianAndMode {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfItems = scan.nextInt();
            int[] values = new int[numberOfItems];

            Map<Integer, Integer> frequencyMap = new HashMap<>();

            int sum = 0;
            for (int i = 0; i < numberOfItems; i++) {
                int value = scan.nextInt();
                values[i] = value;
                sum += value;
                frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
            }

            Arrays.sort(values);
            System.out.printf("%.1f\n", mean(sum, numberOfItems));
            System.out.printf("%.1f\n", median(values));
            System.out.printf("%d", mode(frequencyMap));
        }
    }

    private static double mean(int sum, int count) {
        return (double) sum / count;
    }

    private static double median(int[] sortedArray) {
        int n = sortedArray.length;
        if (n % 2 == 0) {
            return (sortedArray[n / 2 - 1] + sortedArray[n / 2]) / 2.0;
        }

        return sortedArray[n / 2];
    }

    private static int mode(Map<Integer, Integer> frequencyMap) {
        int mode = Integer.MAX_VALUE;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int value = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency || (frequency == maxFrequency && value < mode)) {
                maxFrequency = frequency;
                mode = value;
            }
        }

        return mode;
    }
}
