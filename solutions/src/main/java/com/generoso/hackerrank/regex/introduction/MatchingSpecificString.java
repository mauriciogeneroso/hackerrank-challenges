package com.generoso.hackerrank.regex.introduction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificString {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("hackerrank");
    }

    private static class RegexTest {

        public void checker(String regexPattern) {
            String testString;
            try (Scanner input = new Scanner(System.in)) {
                testString = input.nextLine();
            }
            Pattern pattern = Pattern.compile(regexPattern);
            Matcher matcher = pattern.matcher(testString);
            int counter = 0;
            while (matcher.find()) {
                counter += 1;
            }

            System.out.format("Number of matches : %d", counter);
        }
    }

}