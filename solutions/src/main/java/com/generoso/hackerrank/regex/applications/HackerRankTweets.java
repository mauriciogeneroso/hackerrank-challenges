package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;

public class HackerRankTweets {

    private static final String REGEX = ".*[Hh][Aa][Cc][Kk][Ee][Rr][Rr][Aa][Nn][Kk].*";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());
            int count = 0;
            while (numberOfLines-- > 0) {
                if (scan.nextLine().matches(REGEX)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
