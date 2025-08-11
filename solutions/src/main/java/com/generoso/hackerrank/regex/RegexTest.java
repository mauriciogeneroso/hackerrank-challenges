package com.generoso.hackerrank.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public void checker(String regexPattern) {
        String testString;
        try (Scanner input = new Scanner(System.in)) {
            testString = input.nextLine();
        }
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(testString);
        System.out.println(matcher.find());
    }

}