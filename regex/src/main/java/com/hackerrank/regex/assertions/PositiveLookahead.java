package com.hackerrank.regex.assertions;

import com.hackerrank.regex.RegexTest;

public class PositiveLookahead {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("o(?=oo)");
    }
}
