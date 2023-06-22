package com.hackerrank.regex.introduction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexTest {

    public void checker(String regexPattern){
        Scanner input = new Scanner(System.in);
        String testString = input.nextLine();
        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(testString);
        System.out.println(m.find());
    }

}