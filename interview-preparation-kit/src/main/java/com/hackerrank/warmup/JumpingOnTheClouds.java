package com.hackerrank.warmup;

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
}
