package com.generoso.hackerrank.problemsolving.warmup;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        for (int i = 0, j = 0; i < arr.size(); i++, j++) {
            firstDiagonalSum += arr.get(i).get(j);
        }

        for (int i = arr.size() - 1, j = 0; i >= 0; i--, j++) {
            secondDiagonalSum += arr.get(i).get(j);
        }

        return Math.abs(firstDiagonalSum - secondDiagonalSum);
    }

    public static int diagonalDifference2(List<List<Integer>> arr) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(i).get(arr.get(i).size() - (1 + i));
        }

        return Math.abs(leftSum - rightSum);
    }
}
