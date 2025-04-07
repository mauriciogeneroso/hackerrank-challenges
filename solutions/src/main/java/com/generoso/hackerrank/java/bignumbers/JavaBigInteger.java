package com.generoso.hackerrank.java.bignumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        BigInteger b1 = scan.nextBigInteger();
        BigInteger b2 = scan.nextBigInteger();

        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}
