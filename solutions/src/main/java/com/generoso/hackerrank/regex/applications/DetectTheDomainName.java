package com.generoso.hackerrank.regex.applications;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DetectTheDomainName {

    private static final Pattern PATTERN = Pattern.compile("https?://(?:www\\d*\\.)?([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})");

    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();

        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < numberOfLines; i++) {
                String line = scan.nextLine();

                Matcher matcher = PATTERN.matcher(line);
                while (matcher.find()) {
                    emails.add(matcher.group(1));
                }
            }
        }

        System.out.println(emails.stream().sorted().collect(Collectors.joining(";")));
    }
}
