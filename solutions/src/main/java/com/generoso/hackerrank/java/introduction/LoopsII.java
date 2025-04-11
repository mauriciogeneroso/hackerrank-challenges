package com.generoso.hackerrank.java.introduction;

import java.util.Scanner;

public class LoopsII {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            int powerOfTwo = 1;

            for (int j = 0; j < n; j++) {
                sum += powerOfTwo * b;
                System.out.printf("%d ", sum);
                powerOfTwo *= 2;
            }
            System.out.println();
        }
        in.close();
    }

//    public static void main(String[] argh) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for (int i = 0; i < t; i++) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//
//            for (int j = 0; j < n; j++) {
//                int sum = a;
//                for (int k = 0; k <= j; k++) {
//                    sum += (int) (Math.pow(2, k) * b);
//                }
//                System.out.printf("%d ", sum);
//            }
//            System.out.println();
//        }
//        in.close();
//    }
}
