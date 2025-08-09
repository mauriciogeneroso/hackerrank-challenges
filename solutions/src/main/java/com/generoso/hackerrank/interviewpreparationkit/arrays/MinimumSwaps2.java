package com.generoso.hackerrank.interviewpreparationkit.arrays;

import java.util.List;

public class MinimumSwaps2 {

    public String minimumBribes(List<Integer> q) {
        int bribe = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1) > 2) {
                return "Too chaotic";
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    bribe++;
                }
            }
        }

        return String.valueOf(bribe);
    }

    public String minimumBribes2(List<Integer> q) {
        int totalBribes = 0;

        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;

        for (Integer value : q) {
            if (value == expectedFirst) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (value == expectedSecond) {
                ++totalBribes;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (value == expectedThird) {
                totalBribes += 2;
                ++expectedThird;
            } else {
                return "Too chaotic";
            }
        }

        return String.valueOf(totalBribes);
    }

}
