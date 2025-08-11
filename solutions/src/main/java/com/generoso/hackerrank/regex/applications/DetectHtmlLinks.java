package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHtmlLinks {

    private static final Pattern LINK_PATTERN = Pattern.compile(
            "<a\\s+href\\s*=\\s*\"([^\"]+)\"[^>]*>(.*?)</a>",
            Pattern.CASE_INSENSITIVE
    );

    private static final Pattern INNER_TAGS = Pattern.compile("<[^>]+>");

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());

            while (numberOfLines-- > 0) {
                String line = scan.nextLine();

                Matcher matcher = LINK_PATTERN.matcher(line);

                while (matcher.find()) {
                    String href = matcher.group(1).trim();
                    String text = matcher.group(2);
                    text = INNER_TAGS.matcher(text).replaceAll("").trim();

                    System.out.println(href + "," + text);
                }
            }
        }
    }
}
