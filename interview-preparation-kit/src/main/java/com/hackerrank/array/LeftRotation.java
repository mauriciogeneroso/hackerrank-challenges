package com.hackerrank.array;

public class LeftRotation {

    public int[] rotLeft(int[] a, int d) {
        for (int i = 0; i < d; i++) {
            int first = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = first;
        }

        return a;
    }
}