package com.hackerrank.regex.introduction;

public class MatchingWhitespaceAndNonWhitespaceCharacter {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("\\S{2}\\s{1}\\S{2}\\s{1}\\S{2}");
    }
}
