package com.generoso.hackerrank.regex.introduction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingAnythingButANewline {

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.check("^((.{3})\\.?){4}$");
    }

    static class Tester {
        public void check(String regexPattern) {
            String testString;
            try (Scanner scanner = new Scanner(System.in)) {
                testString = scanner.nextLine();
            }
            Pattern pattern = Pattern.compile(regexPattern);
            Matcher matcher = pattern.matcher(testString);
            boolean isMatching = matcher.matches();
            System.out.format("%s", isMatching);
        }
    }
}