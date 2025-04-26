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
            Set<String> tagNames = new TreeSet<>(Comparator.naturalOrder());
            while (numberOfLines-- > 0) {
                String line = scan.nextLine();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    tagNames.add(matcher.group(1));
                }
            }

            Iterator<String> iterator = tagNames.iterator();
            StringBuilder output = new StringBuilder();
            while (iterator.hasNext()) {
                output.append(iterator.next()).append(";");
            }
            if (output.length() > 0) {
                output.deleteCharAt(output.length() - 1);
            }
            System.out.println(output);
        }
    }
}
