package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;

public class FindHackerRank {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());
            while (numberOfLines-- > 0) {
                String line = scan.nextLine();

                boolean startsWith = startsWith(line);
                boolean endsWith = endsWith(line);

                if (startsWith && endsWith) {
                    System.out.println(0);
                } else if (startsWith) {
                    System.out.println(1);
                } else if (endsWith) {
                    System.out.println(2);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }

    private static boolean startsWith(String line) {
        return line.matches("^hackerrank.*");
    }

    private static boolean endsWith(String line) {
        return line.matches(".*hackerrank$");
    }
}
