package com.generoso.hackerrank.java.advanced;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256 {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        try (Scanner scan = new Scanner(System.in)) {
            String input = scan.nextLine();

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(input.getBytes());

            for (byte h : hash) {
                System.out.printf("%02x", h);
            }
        }
    }
}
