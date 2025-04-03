package com.hackerrank.thrirtydaysofcode.day10binarynumbers;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binary = Integer.toBinaryString(n);
        int max = 0;
        int counter = 0;

        for (int i = 0; i < binary.length(); i++) {
            char current = binary.charAt(i);

            if (current == '1') {
                counter++;
            } else {
                if (counter > max) {
                    max = counter;
                }
                counter = 0;
            }
        }

        if (counter > max) {
            max = counter;
        }

        System.out.println(max);

        scanner.close();
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//        String binary = Integer.toBinaryString(n);
//
//        String[] groups = binary.split("0");
//        int max = 0;
//
//        for (int i = 0; i < groups.length; i++) {
//            if (groups[i].length() > max) {
//                max = groups[i].length();
//            }
//        }
//
//        System.out.println(max);
//        bufferedReader.close();
//    }
}
