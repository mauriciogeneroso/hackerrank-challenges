package com.hackerrank.ps.algorithms.warmup;

import java.util.Scanner;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
