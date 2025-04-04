package com.generoso.hackerrank.thrirtydaysofcode.day25timeandcomplexity;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] numbers = new int[T];

        for (int i = 0; i < T; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            boolean prime = true;
            for (int j = 2; j <= numbers[i] / 2; j++) {
                if (numbers[i] % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (numbers[i] != 1 && prime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}

