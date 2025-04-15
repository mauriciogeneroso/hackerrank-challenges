package com.generoso.hackerrank.java.string;


import java.util.Scanner;

public class ValidUsernameRegularExpression {

    static class UsernameValidator {
        /*
         * Write regular expression here.
         */
        public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
    }

    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(SCAN.nextLine());
        while (n-- != 0) {
            String userName = SCAN.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
