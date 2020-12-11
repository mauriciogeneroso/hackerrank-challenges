package com.hackerrank.warmup.salesbymatch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int n = 7; // number of elements
        int[] ar = {1, 2, 1, 2, 1, 3, 2}; // pairs

        int numberOgMatchingPairs = sockMerchant(n, ar);
        System.out.println(numberOgMatchingPairs);
    }

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int numberOfMatchingPairs = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : ar) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.remove(i);
                ++numberOfMatchingPairs;
            }
        }

        return numberOfMatchingPairs;
    }
}
