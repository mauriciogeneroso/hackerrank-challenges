package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ProgrammingLanguageDetection {

    private static final Pattern C_PATTERN = Pattern.compile("#include<stdio.h>");
    private static final Pattern JAVA_PATTERN = Pattern.compile("import\\sjava");
    private static final Pattern PHYTHON_PATTERN = Pattern.compile("(print\\s|def\\s)");

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder inputCode = new StringBuilder();
            while (scanner.hasNextLine()) {
                inputCode.append(scanner.nextLine()).append('\n');
            }

            String code = inputCode.toString();
            if (isMatching(C_PATTERN, code)) {
                System.out.println("C");
            } else if (isMatching(JAVA_PATTERN, code)) {
                System.out.println("Java");
            } else if (isMatching(PHYTHON_PATTERN, code)) {
                System.out.println("Python");
            } else {
                System.out.println("Unknown");
            }
        }
    }

    private static boolean isMatching(Pattern pattern, String input) {
        return pattern.matcher(input).find();
    }
}
