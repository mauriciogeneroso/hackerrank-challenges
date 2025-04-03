package com.hackerrank.thrirtydaysofcode.day8dictionariesandmaps;
//Complete this code or write your own from scratch

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (map.containsKey(s)) {
                System.out.printf("%s=%d\n", s, map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
