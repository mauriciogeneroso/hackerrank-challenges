package com.generoso.hackerrank.regex.backreferences;

import com.generoso.hackerrank.regex.RegexTest;

public class MatchingSameTextAgainAndAgain {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^([a-z])(\\w)(\\s)(\\W)(\\d)(\\D)([A-Z])([a-zA-Z])([aeuouAEIOU])(\\S)\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10");
    }
}
