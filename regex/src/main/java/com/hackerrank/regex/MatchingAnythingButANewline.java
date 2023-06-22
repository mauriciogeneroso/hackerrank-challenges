package com.hackerrank.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingAnythingButANewline {

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.check("^((.{3})\\.?){4}");
    }
}

class Tester {

    public void check(String pattern){
        Scanner scanner = new Scanner(System.in);
        String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        boolean match = m.matches();
        System.out.format("%s", match);
    }
}