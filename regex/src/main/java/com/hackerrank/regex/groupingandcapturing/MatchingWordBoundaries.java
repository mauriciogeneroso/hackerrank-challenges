package com.hackerrank.regex.groupingandcapturing;

import com.hackerrank.regex.RegexTest;

public class MatchingWordBoundaries {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("\\b[aeiouAEIOU][a-zA-Z]*\\b");
    }
}
