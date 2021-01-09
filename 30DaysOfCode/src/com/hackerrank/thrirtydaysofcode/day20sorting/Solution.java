package com.hackerrank.thrirtydaysofcode.day20sorting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int swapsCounter = 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                    swapsCounter++;
                }
            }
        }


        System.out.println("Array is sorted in " + swapsCounter + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}

