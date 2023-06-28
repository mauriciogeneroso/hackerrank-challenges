package com.hackerrank.regex.repetition;

import com.hackerrank.regex.RegexTest;

public class MatchingZeroOrMoreRepetitions {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^[0-9]{2,}[a-z]*[0A-Z]*$");
    }
}
