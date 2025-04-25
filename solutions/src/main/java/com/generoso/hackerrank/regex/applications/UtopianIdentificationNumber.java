package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;

public class UtopianIdentificationNumber {

    private static final String REGEX = "^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}$";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());
            while (numberOfLines-- > 0) {
                System.out.println(scan.nextLine().matches(REGEX) ? "VALID" : "INVALID");
            }
        }
    }
}
