package com.generoso.hackerrank.problemsolving.warmup;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int pointsA = 0;
        int pointsB = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                pointsA++;
            } else if (a.get(i) < b.get(i)) {
                pointsB++;
            }
        }

        return Arrays.asList(pointsA, pointsB);
    }
}
