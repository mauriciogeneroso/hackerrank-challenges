package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;

public class ValidPanFormat {

    private static final String REGEX = "^[A-Z]{5}[0-9]{4}[A-Z]$";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());
            while (numberOfLines-- > 0) {
                System.out.println(scan.nextLine().matches(REGEX) ? "YES" : "NO");
            }
        }
    }
}
