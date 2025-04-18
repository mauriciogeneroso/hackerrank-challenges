package com.generoso.hackerrank.java.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> arrays = new ArrayList<>();


        int numberOfArrays = scan.nextInt();
        java.util.stream.IntStream.range(0, numberOfArrays).forEach(i -> {
            int numberOfElements = scan.nextInt();
            arrays.add(new ArrayList<>());
            java.util.stream.IntStream.range(0, numberOfElements).forEach(j -> arrays.get(i).add(scan.nextInt()));
        });

        int numberOfQueries = scan.nextInt();
        java.util.stream.IntStream.range(0, numberOfQueries).forEach(i -> {
            int index = scan.nextInt() - 1;
            int element = scan.nextInt() - 1;
            if (index < arrays.size() && element < arrays.get(index).size()) {
                System.out.println(arrays.get(index).get(element));
            } else {
                System.out.println("ERROR!");
            }
        });
    }
}
