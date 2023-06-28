package com.hackerrank.regex.characterclass;

import com.hackerrank.regex.RegexTest;

public class ExcludingSpecificCharacters {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^[^0-9][^aeiou][^bcDF][^\\s][^AEIOU][^.,]$");
    }
}
