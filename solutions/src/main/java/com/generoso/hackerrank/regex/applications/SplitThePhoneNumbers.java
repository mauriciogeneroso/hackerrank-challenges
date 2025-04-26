package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitThePhoneNumbers {

    private static final Pattern PATTERN = Pattern.compile("^(\\d{1,3})[-\\s](\\d{1,3})[-\\s](\\d{4,10})$");

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfTests = Integer.parseInt(scan.nextLine());
            while(numberOfTests-- > 0) {
                String line = scan.nextLine();
                Matcher matcher = PATTERN.matcher(line);
                if (matcher.find()) {
                    String countryCode = matcher.group(1);
                    String localAreaCode = matcher.group(2);
                    String number = matcher.group(3);
                    System.out.printf("CountryCode=%s,LocalAreaCode=%s,Number=%s\n", countryCode, localAreaCode, number);
                }
            }
        }
    }
}
