package com.generoso.hackerrank.regex.backreferences;

import com.generoso.hackerrank.regex.RegexTest;

public class BackReferencesToFailedGroups {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^\\d{2}(-?)\\d{2}\\1\\d{2}\\1\\d{2}$");
    }
}
