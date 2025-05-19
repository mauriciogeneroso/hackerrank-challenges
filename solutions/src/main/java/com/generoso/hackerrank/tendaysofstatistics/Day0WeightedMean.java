package com.generoso.hackerrank.tendaysofstatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day0WeightedMean {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> weights = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        weightedMean(vals, weights);

        bufferedReader.close();
    }

    public static void weightedMean(List<Integer> values, List<Integer> weightList) {
        int sumOfvaluesMultipliedWithWeight = 0;
        int weightSum = 0;

        for (int i = 0; i < values.size(); i++) {
            int weight = weightList.get(i);
            sumOfvaluesMultipliedWithWeight += values.get(i) * weight;
            weightSum += weight;
        }

        System.out.printf("%.1f", (sumOfvaluesMultipliedWithWeight / (double) weightSum));
    }
}