package com.hackerrank.warmup;

import java.util.*;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    public int sockMerchant(int n, int[] ar) {
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

    public int sockMerchant2(int n, int[] ar) {
        int numberOfMatchingPairs = 0;

        for (int i = 0; i < n; i++) {
            if (ar[i] != 0) {
                for (int j = i + 1; j < n; j++) {
                    if (ar[i] == ar[j]) {
                        numberOfMatchingPairs++;
                        ar[j] = 0;
                        break;
                    }
                }
            }
        }

        return numberOfMatchingPairs;
    }

    public int sockMerchant3(int n, int[] ar) {
        int numberOfMatchingPairs = 0;
        int previous = ar[0];
        boolean first = false;

        Arrays.sort(ar);
        for (int i = 1; i < n; i++) {
            if (!first) {
                if (previous == ar[i]) {
                    numberOfMatchingPairs++;
                }
                first = true;
            } else {
                first = false;
            }

            previous = ar[i];
        }

        return numberOfMatchingPairs;
    }

    public int sockMerchant4(int n, int[] ar) {
        int numberOfMatchingPairs = 0;

        Set<Integer> colors = new HashSet<>();

        for (int value : ar) {
            if (!colors.contains(value)) {
                colors.add(value);
            } else {
                colors.remove(value);
                numberOfMatchingPairs++;
            }
        }

        return numberOfMatchingPairs;
    }
}
