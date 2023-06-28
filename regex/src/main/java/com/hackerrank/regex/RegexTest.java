package com.hackerrank.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public void checker(String regexPattern){
        Scanner input = new Scanner(System.in);
        String testString = input.nextLine();
        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(testString);
        System.out.println(m.find());
    }

}