package com.generoso.hackerrank.java.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int numberOfElements = scan.nextInt();
        IntStream.range(0, numberOfElements).forEach(i -> list.add(scan.nextInt()));

        int numberOfOperations = scan.nextInt();
        for (int i = 0; i < numberOfOperations; i++) {
            scan.skip("\n");
            String operation = scan.next();
            if ("Insert".equalsIgnoreCase(operation)) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else if ("Delete".equalsIgnoreCase(operation)) {
                list.remove(scan.nextInt());
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
        scan.close();
    }
}
