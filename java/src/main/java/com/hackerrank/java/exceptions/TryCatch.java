package com.hackerrank.java.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        try {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(a/b);
        } catch (InputMismatchException ex) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ex) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
