package com.generoso.hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
abstract class Flower {

    abstract String whatsYourName();
}

class Jasmine extends Flower {

    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {

    String whatsYourName() {
        return "Lily";
    }
}

abstract class Region {

    abstract Flower yourNationalFlower();
}

class WestBengal extends Region {

    Flower yourNationalFlower() {
        return new Jasmine();
    }

}

class AndhraPradesh extends Region {

    Flower yourNationalFlower() {
        return new Lily();
    }
}

public class Covariance {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
