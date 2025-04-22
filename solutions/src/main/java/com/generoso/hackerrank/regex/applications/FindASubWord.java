package com.generoso.hackerrank.regex.applications;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindASubWord {

    private static final String WORD_REGEX = "\\b\\w+\\b";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfSentences = Integer.parseInt(scan.nextLine());

        List<String> sentences = new ArrayList<>();
        while (numberOfSentences-- > 0) {
            sentences.add(scan.nextLine());
        }

        int numberOfQueries = Integer.parseInt(scan.nextLine());
        while (numberOfQueries-- > 0) {
            String query = scan.next();
            String regex = "\\B" + Pattern.quote(query) + "\\B";
            Pattern pattern = Pattern.compile(regex);

            int count = 0;
            for (String sentence : sentences) {
                Matcher matcher = Pattern.compile(WORD_REGEX).matcher(sentence);
                while (matcher.find()) {
                    String word = matcher.group();
                    if (pattern.matcher(word).find()) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        scan.close();
    }
}
