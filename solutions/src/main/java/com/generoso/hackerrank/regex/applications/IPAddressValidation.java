package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;

public class IPAddressValidation {

    private static final String IPV4_REGEX =
            "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

    private static final String IPV6_REGEX =
            "^(([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}|(::([0-9a-fA-F]{1,4}:){0,6}[0-9a-fA-F]{1,4})|(([0-9a-fA-F]{1,4}:){1,6}:))$";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scan.nextLine());
        while (numberOfLines-- > 0) {
            String line = scan.nextLine();
            if (line.matches(IPV4_REGEX)) {
                System.out.println("IPv4");
            } else if (line.matches(IPV6_REGEX)) {
                System.out.println("IPv6");
            } else {
                System.out.println("Neither");
            }
        }
        scan.close();
    }
}
