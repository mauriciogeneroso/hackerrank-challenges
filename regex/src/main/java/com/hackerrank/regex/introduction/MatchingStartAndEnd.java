package com.hackerrank.regex.introduction;

import com.hackerrank.regex.RegexTest;

public class MatchingStartAndEnd {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^\\d{1}\\w{4}\\.$");
    }
}
