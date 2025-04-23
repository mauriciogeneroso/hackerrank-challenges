package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;

public class AlienUsername {

    private static final String USERNAME_REGEX = "^[_.]\\d+[a-zA-Z]*_?$";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfUsernames = Integer.parseInt(scan.nextLine());
        while (numberOfUsernames-- > 0) {
            String username = scan.nextLine();
            System.out.println(username.matches(USERNAME_REGEX) ? "VALID" : "INVALID");
        }
        scan.close();
    }
}
