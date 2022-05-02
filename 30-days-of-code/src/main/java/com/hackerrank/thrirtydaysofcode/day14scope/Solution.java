package com.hackerrank.thrirtydaysofcode.day14scope;

import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        for (int i = 0; i < this.elements.length - 1; i++) {
            for (int j = i + 1; j < this.elements.length; j++) {

                int abs = Math.abs(elements[i] - elements[j]);
                if (abs > maximumDifference) {
                    maximumDifference = abs;
                }
            }
        }
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}