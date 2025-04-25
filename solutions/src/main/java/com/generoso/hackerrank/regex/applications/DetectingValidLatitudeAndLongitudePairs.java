package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;

public class DetectingValidLatitudeAndLongitudePairs {

    private static final String REGEX = "^\\([-+]?(90(\\.0+)?|[1-8]?\\d(\\.\\d+)?),\\s[-+]?(180(\\.0+)?|1[0-7]\\d(\\.\\d+)?|[1-9]?\\d(\\.\\d+)?)\\)$";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());
            while (numberOfLines-- > 0) {
                System.out.println(scan.nextLine().matches(REGEX) ? "Valid" : "Invalid");
            }
        }
    }
}
