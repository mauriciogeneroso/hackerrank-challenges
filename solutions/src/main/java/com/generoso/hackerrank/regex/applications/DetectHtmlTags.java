package com.generoso.hackerrank.regex.applications;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHtmlTags {

    private static final String REGEX = "<\\s*([a-zA-Z0-9]+)[^>]*>";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());
            Pattern pattern = Pattern.compile(REGEX);
            Set<String> tagNames = new TreeSet<>();

            for (int i = 0; i < numberOfLines; i++) {
                Matcher matcher = pattern.matcher(scan.nextLine());
                while (matcher.find()) {
                    tagNames.add(matcher.group(1));
                }
            }

            System.out.println(String.join(";", tagNames));
        }
    }
}
