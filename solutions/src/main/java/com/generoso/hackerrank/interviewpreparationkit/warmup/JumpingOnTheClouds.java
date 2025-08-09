package com.generoso.hackerrank.interviewpreparationkit.warmup;

public class JumpingOnTheClouds {

    public int jumpingOnClouds(int[] c) {
        int countJumps = 0;

        for (int i = 0; i < c.length - 1; ) {
            if (i + 2 < c.length && c[i + 2] == 0) {
                i += 2;
            } else {
                i++;
            }
            countJumps++;
        }

        return countJumps;
    }

    public int jumpingOnClouds2(int[] c) {
        int countJumps = 0;

        for (int i = 0; i < c.length - 1; i++, countJumps++) {
            if (i + 2 < c.length && c[i + 2] == 0) {
                i++;
            }
        }

        return countJumps;
    }
}
