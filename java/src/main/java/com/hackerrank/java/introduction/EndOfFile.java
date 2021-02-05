package com.hackerrank.java.introduction;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineCount = 1;
        while (scan.hasNext()) {
            System.out.printf("%d %s\n", lineCount++, scan.nextLine());
        }
    }
}
