package com.hackerrank.regex.repetition;

import com.hackerrank.regex.RegexTest;

public class MatchingXYRepetitions {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^[0-9]{1,2}[a-zA-Z]{3,}[.]{0,3}$");
    }
}
