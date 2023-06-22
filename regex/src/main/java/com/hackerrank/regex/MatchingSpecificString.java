package com.hackerrank.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificString {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("hackerrank");
    }

}

class RegexTest {

    public void checker(String regexPattern) {
        Scanner input = new Scanner(System.in);
        String testString = input.nextLine();
        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(testString);
        int count = 0;
        while (m.find()) {
            count += 1;
        }

        System.out.format("Number of matches : %d", count);
    }
}