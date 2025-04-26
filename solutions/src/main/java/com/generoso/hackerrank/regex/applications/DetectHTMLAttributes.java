package com.generoso.hackerrank.regex.applications;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLAttributes {

    private static final String TAGS_AND_ATTRIBUTES = "<\\s*([a-zA-Z0-9]+)\\s*([^>]*)>";
    private static final String ATTRIBUTE_NAMES = "([a-zA-Z]+)=[\"']";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());
            Pattern tagsAndAttributesPattern = Pattern.compile(TAGS_AND_ATTRIBUTES);
            Pattern attributeNamesPattern = Pattern.compile(ATTRIBUTE_NAMES);
            Map<String, Set<String>> tagAndAttributes = new TreeMap<>();

            for (int i = 0; i < numberOfLines; i++) {
                Matcher matcher = tagsAndAttributesPattern.matcher(scan.nextLine());
                while (matcher.find()) {
                    String tagName = matcher.group(1);
                    tagAndAttributes.putIfAbsent(tagName, new TreeSet<>());

                    Matcher attributeNamesMatcher = attributeNamesPattern.matcher(matcher.group(2));
                    while (attributeNamesMatcher.find()) {
                        tagAndAttributes.get(tagName).add(attributeNamesMatcher.group(1));
                    }
                }
            }

            tagAndAttributes.forEach((tag, attributes) ->
                    System.out.printf("%s:%s\n", tag, String.join(",", attributes))
            );
        }
    }
}
