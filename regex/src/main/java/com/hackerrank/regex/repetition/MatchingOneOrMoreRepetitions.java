package com.hackerrank.regex.repetition;

import com.hackerrank.regex.RegexTest;

public class MatchingOneOrMoreRepetitions {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^[0-9]+[A-Z]+[a-z]+$");
    }
}
