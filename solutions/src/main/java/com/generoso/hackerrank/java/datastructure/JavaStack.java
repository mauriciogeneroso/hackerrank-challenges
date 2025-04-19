package com.generoso.hackerrank.java.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
        sc.close();
    }

    private static boolean isBalanced(String input) {
        if (input.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
