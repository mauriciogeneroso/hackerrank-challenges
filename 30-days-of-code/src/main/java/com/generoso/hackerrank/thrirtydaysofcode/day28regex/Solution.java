package com.generoso.hackerrank.thrirtydaysofcode.day28regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> listOfNames = new ArrayList<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            Pattern p = Pattern.compile(".+@gmail\\.com$");
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                listOfNames.add(firstName);
            }
        }

        Collections.sort(listOfNames);
        listOfNames.forEach(System.out::println);
        scanner.close();
    }
}