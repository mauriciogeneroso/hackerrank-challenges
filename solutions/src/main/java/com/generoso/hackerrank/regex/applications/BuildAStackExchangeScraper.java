package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuildAStackExchangeScraper {

    private static final Pattern REGEX_PATTERN = Pattern.compile(
            "id=\"question-summary-(\\d+)\"[^>]*>[\\s\\S]*?" +                        // ID
                    "<a[^>]*class=\"question-hyperlink\"[^>]*>(.*?)</a>[\\s\\S]*?" +  // Title
                    "<span.*class=\"relativetime\">(.*?)</span>",                     // Time
            Pattern.CASE_INSENSITIVE
    );

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder html = new StringBuilder();

        while (scan.hasNextLine()) {
            html.append(scan.nextLine()).append("\n");
        }
        scan.close();

        Matcher matcher = REGEX_PATTERN.matcher(html.toString());
        while (matcher.find()) {
            String id = matcher.group(1).trim();
            String questionText = matcher.group(2).trim();
            String timeAgo = matcher.group(3).trim();
            System.out.println(id + ";" + questionText + ";" + timeAgo);
        }
    }
}
