package com.generoso.hackerrank.regex.introduction;

import com.generoso.hackerrank.regex.RegexTest;

public class MatchingWhitespaceAndNonWhitespaceCharacter {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("\\S{2}\\s{1}\\S{2}\\s{1}\\S{2}");
    }
}
