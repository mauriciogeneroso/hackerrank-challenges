package com.hackerrank.regex.introduction;

import com.hackerrank.regex.RegexTest;

public class MatchingDigitsAndNonDigitCharacters {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("\\d{2}\\D{1}\\d{2}\\D{1}\\d{4}");
    }
}