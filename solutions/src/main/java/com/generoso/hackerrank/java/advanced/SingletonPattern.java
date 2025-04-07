package com.generoso.hackerrank.java.advanced;

public class SingletonPattern {

    private static SingletonPattern s;
    public String str;

    private SingletonPattern() {
    }

    static SingletonPattern getSingleInstance() {
        if (s == null) {
            s = new SingletonPattern();
        }

        return s;
    }
}
