package com.hackerrank.regex.repetition;

import com.hackerrank.regex.RegexTest;

public class MatchingXRepetitions {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^[02468a-zA-z]{40}[13579\\s]{5}$");
    }
}
