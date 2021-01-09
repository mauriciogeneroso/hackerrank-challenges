package com.hackerrank.thrirtydaysofcode.day18queueandstacks;

import java.util.Scanner;

public class Solution {

    String stack = new String();
    String queue = new String();

    public void pushCharacter(char c) {
        stack += c;
    }

    public void enqueueCharacter(char c) {
        queue += c;
    }

    public char popCharacter() {
        char cc = stack.charAt(stack.length() - 1);
        stack = stack.substring(0, stack.length() - 1);
        return cc;
    }

    public char dequeueCharacter() {
        char cc = stack.charAt(0);
        stack = stack.substring(1, stack.length());
        return cc;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
