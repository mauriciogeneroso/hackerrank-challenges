package com.generoso.hackerrank.regex.repetition;

import com.generoso.hackerrank.regex.RegexTest;

public class MatchingOneOrMoreRepetitions {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^[0-9]+[A-Z]+[a-z]+$");
    }
}
