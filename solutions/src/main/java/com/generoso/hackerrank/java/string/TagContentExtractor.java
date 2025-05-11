package com.generoso.hackerrank.java.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    private static final Pattern PATTERN = Pattern.compile("<([^>]+)>([^<]+)</\\1>");

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases-- > 0){
            String line = in.nextLine();
            Matcher matcher = PATTERN.matcher(line);

            boolean found = false;
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        in.close();
    }
}
