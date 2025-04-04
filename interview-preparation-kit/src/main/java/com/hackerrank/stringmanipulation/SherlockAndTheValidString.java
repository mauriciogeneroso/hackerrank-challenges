package com.hackerrank.stringmanipulation;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SherlockAndTheValidString {

    public String isValid(String s) {
        int[] charFreq = new int[26];
        s.chars().forEach(c -> charFreq[c - 'a']++);

        Map<Integer, Integer> freqCountMap = Arrays.stream(charFreq)
                .filter(i -> i > 0)
                .boxed()
                .collect(Collectors.toMap(i -> i, i -> 1, Integer::sum));

        if (freqCountMap.size() == 1) {
            return "YES";
        } else if (freqCountMap.size() == 2) {
            int[] freqCount = freqCountMap.keySet()
                    .stream()
                    .mapToInt(i -> i)
                    .toArray();
            for (int i = 0; i < 2; i++) {
                if (freqCountMap.get(freqCount[i]) == 1) {
                    if (freqCount[i] - freqCount[i ^ 1] == 1 || freqCount[i] - 1 == 0) {
                        return "YES";
                    }
                }
            }
        }

        return "NO";
    }

}
