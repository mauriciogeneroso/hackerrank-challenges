package com.generoso.hackerrank.java.advanced;

public class SingletonPattern {

    private static SingletonPattern singleton;
    public String str;

    private SingletonPattern() {
    }

    static SingletonPattern getSingleInstance() {
        if (singleton == null) {
            singleton = new SingletonPattern();
        }

        return singleton;
    }
}
