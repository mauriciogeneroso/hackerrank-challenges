package com.generoso.hackerrank.interviewpreparationkit.stringmanipulation;

import java.util.Arrays;

public class MakingAnagrams {

    public int makeAnagram(String a, String b) {
        StringBuilder as = new StringBuilder(a);
        StringBuilder bs = new StringBuilder(b);

        for (int i = 0; i < as.length(); i++) {
            int index = bs.indexOf(String.valueOf(as.charAt(i)));
            if (index != -1) {
                as.deleteCharAt(i--);
                bs.deleteCharAt(index);
            }
        }


        return as.length() + bs.length();
    }

    // 'a' = 97
    public int numberNeeded(String first, String second) {
        int[] freq = new int[26];
        first.chars().forEach(c -> freq[c - 97]++);
        second.chars().forEach(c -> freq[c - 97]--);
        return Arrays.stream(freq).map(Math::abs).sum();
    }
}
