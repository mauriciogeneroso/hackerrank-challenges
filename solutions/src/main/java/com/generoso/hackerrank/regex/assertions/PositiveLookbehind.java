package com.generoso.hackerrank.regex.assertions;

import com.generoso.hackerrank.regex.RegexTest;

public class PositiveLookbehind {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("(?<=[1,3,5,7,9])[0-9]");
    }
}
