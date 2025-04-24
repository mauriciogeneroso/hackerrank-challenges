package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;

public class SayingHi {

    private static final String REGEX = "^[hH][Ii]\\s[^dD].*";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfSentenses = Integer.parseInt(scan.nextLine());
            while (numberOfSentenses-- > 0) {
                String line = scan.nextLine();
                if (line.matches(REGEX)) {
                    System.out.println(line);
                }
            }
        }
    }
}
