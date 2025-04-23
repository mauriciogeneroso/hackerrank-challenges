package com.generoso.hackerrank.regex.applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfEntries = Integer.parseInt(scan.nextLine());

        List<String> sentences = new ArrayList<>();
        while(numberOfEntries-- > 0) {
            sentences.add(scan.nextLine());
        }

        int numberOfWords = Integer.parseInt(scan.nextLine());
        while (numberOfWords-- > 0) {
            String word = scan.nextLine();
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b");

            int count = 0;
            for (String sentence : sentences) {
                Matcher matcher = pattern.matcher(sentence);
                while (matcher.find()) {
                    count++;
                }
            }

            System.out.println(count);
        }
        scan.close();
    }
}
