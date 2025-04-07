package com.generoso.hackerrank.java.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            char letter = b.charAt(i);
            if (!map.containsKey(letter)) {
                return false;
            }

            Integer frequency = map.get(letter);
            if (frequency == 0) {
                return false;
            } else {
                map.put(letter, --frequency);
            }
        }

        return true;
    }

    //
    static boolean isAnagram2(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int sum = 0;
        for (char c = 'a'; c < 'z'; c++) {

            // bad loop
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == c) {
                    sum++;
                }
                if (b.charAt(i) == c) {
                    sum--;
                }
            }

            if (sum != 0) {
                return false;
            }
        }

        return true;
    }

    // poor solution
    static boolean isAnagram3(String a, String b) {
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
