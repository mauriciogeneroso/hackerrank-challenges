package com.hackerrank.java.string;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuilder sb = new StringBuilder(A);
        System.out.println(sb.reverse().toString().equals(A) ? "Yes" : "No");
    }
}
