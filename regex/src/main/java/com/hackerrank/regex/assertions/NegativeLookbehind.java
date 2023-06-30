package com.hackerrank.regex.assertions;

import com.hackerrank.regex.RegexTest;

public class NegativeLookbehind {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("(?<![aeiouAEIOU]).");
    }
}
