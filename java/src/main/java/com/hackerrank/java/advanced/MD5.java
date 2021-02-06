package com.hackerrank.java.advanced;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/*
    MD5 is a message digest.
    A message digest is a cryptographic hash function containing a string of digits created by a one-way hashing formula.
    Message digests are designed to protect the integrity of a piece of data or media to detect changes and
    alterations to any part of a message.
 */
public class MD5 {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(s.getBytes());

        BigInteger number = new BigInteger(1, messageDigest);
        String hash = number.toString(16);

        System.out.println(hash);
    }
}
