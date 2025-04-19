package com.generoso.hackerrank.java.datastructure;

public class Generics {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        printArray(1, 2, 3);
        printArray("Hello", "World");
    }

    private static <T> void printArray(T... array) {
        for (T item: array) {
            System.out.println(item);
        }
    }
}
