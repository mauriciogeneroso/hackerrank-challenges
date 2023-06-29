package com.hackerrank.regex.backreferences;

import com.hackerrank.regex.RegexTest;

public class ForwardReferences {

    public static void main(String[] args) {
        RegexTest tester = new RegexTest();
        tester.checker("^(\\2tic|(tac))+$");
    }
}
