package com.generoso.hackerrank.regex.groupingandcapturing;

import com.generoso.hackerrank.regex.RegexTest;

public class AlternativeMatching {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^(Mr|Mrs|Ms|Dr|Er)\\.[a-zA-Z]+$");
    }
}
