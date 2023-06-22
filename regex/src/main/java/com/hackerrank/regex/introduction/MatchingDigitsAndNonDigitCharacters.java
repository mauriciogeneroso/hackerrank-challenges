package com.hackerrank.regex.introduction;

public class MatchingDigitsAndNonDigitCharacters {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("\\d{2}\\D{1}\\d{2}\\D{1}\\d{4}");
    }
}