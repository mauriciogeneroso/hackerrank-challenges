package com.hackerrank.regex.introduction;

public class MatchingWordAndNonWordCharacter {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("\\w{3}\\W{1}\\w{10}\\W{1}\\w{3}");
    }
}
