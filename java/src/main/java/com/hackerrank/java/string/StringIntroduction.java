package com.hackerrank.java.string;

import java.util.Scanner;

public class StringIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        System.out.println(isLexicographically(A, B));
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
    }

    static String isLexicographically(String a, String b) {
        int size = Math.min(a.length(), b.length());

        int i = 0;
        while (i < size) {
            if (b.charAt(i) == a.charAt(i)) {
                i++;
                continue;
            }

            return b.charAt(i) < a.charAt(i) ? "Yes" : "No";
        }

        return "No";
    }

    static String capitalizeFirstLetter(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
