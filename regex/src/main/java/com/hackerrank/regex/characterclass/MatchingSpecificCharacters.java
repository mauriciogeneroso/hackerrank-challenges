package com.hackerrank.regex.characterclass;

import com.hackerrank.regex.RegexTest;

public class MatchingSpecificCharacters {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^[123][012][xs0][30Aa][xsu][.,]$");
    }
}
