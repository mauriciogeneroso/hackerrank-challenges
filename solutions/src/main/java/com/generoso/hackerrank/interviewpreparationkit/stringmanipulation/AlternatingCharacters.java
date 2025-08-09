package com.generoso.hackerrank.interviewpreparationkit.stringmanipulation;

public class AlternatingCharacters {

    public int alternatingCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                count++;
        }

        return count;
    }
}
