package com.hackerrank.warmup;

public class RepeatedString {

    public long repeatedString(String s, long n) {
        if (s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return s.charAt(0) == 'a' ? n : 0;
        }

        long countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countA++;
            }
        }

        countA *= n / s.length();
        long rest = n  % s.length();

        if (rest != 0) {
            for (int i = 0; i < rest; i++) {
                if (s.charAt(i) == 'a') {
                    countA++;
                }
            }
        }

        return countA;
    }
}
