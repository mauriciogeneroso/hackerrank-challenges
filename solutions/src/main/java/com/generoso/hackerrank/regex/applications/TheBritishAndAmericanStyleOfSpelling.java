package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheBritishAndAmericanStyleOfSpelling {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < numberOfLines; i++) {
                text.append(scan.nextLine()).append(" ");
            }

            int numberOfTests = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < numberOfTests; i++) {
                String query = scan.nextLine();
                String root = query.substring(0, query.length() - 2);

                String patternStr = "\\b" + Pattern.quote(root) + "[sz]e\\b";
                Pattern pattern = Pattern.compile(patternStr);

                Matcher matcher = pattern.matcher(text);
                int count = 0;
                while (matcher.find()) {
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}
