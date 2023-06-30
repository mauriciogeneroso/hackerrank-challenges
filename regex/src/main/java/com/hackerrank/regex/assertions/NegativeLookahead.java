package com.hackerrank.regex.assertions;

import com.hackerrank.regex.RegexTest;

public class NegativeLookahead {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("(.{1})(?!(\\1))");
    }
}
