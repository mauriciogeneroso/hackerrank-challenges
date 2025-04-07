package com.generoso.hackerrank.java.string;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i < s.length() - k + 1; i++) {
            String sub = s.substring(i, i + k);
            if (i == 0) {
                smallest = largest = sub;
            } else {
                if (smallest.compareTo(sub) > 0) {
                    smallest = sub;
                }
                if (largest.compareTo(sub) < 0) {
                    largest = sub;
                }
            }
        }

        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargest2(String s, int k) {
        SortedSet<String> sets = new TreeSet<>();

        for (int i = 0; i <= s.length() - k; i++) {
            sets.add(s.substring(i, i + k));
        }

        return sets.first() + "\n" + sets.last();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
