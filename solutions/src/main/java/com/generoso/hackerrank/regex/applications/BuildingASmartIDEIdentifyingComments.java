package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuildingASmartIDEIdentifyingComments {

    private static final Pattern REGEX = Pattern.compile("(//[^\\n]*|/\\*[\\s\\S]*?\\*/)");

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            StringBuilder code = new StringBuilder();
            while (scan.hasNextLine()) {
                code.append(scan.nextLine()).append("\n");
            }

            Matcher matcher = REGEX.matcher(code.toString());
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        }
    }
}
