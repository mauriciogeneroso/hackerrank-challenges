package com.generoso.hackerrank.thrirtydaysofcode.day26nestedlogic;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String returnedInput = scanner.nextLine();
        String dueDateInput = scanner.nextLine();

        String[] returnedValues = returnedInput.split(" ");
        String[] dueDateValues = dueDateInput.split(" ");

        int[] returned = new int[3];
        int[] dueDate = new int[3];

        for (int i = 0; i < 3; i++) {
            returned[i] = Integer.parseInt(returnedValues[i]);
            dueDate[i] = Integer.parseInt(dueDateValues[i]);
        }

        if (returned[2] > dueDate[2]) { // different year
            System.out.println("10000");
        } else if (returned[2] == dueDate[2] && returned[1] > dueDate[1]) { // different month
            System.out.println(500 * (returned[1] - dueDate[1]));
        } else {
            if ((returned[2] < dueDate[2]) || returned[0] <= dueDate[0]) {
                System.out.println(0);
            } else {
                System.out.println(15 * (returned[0] - dueDate[0]));
            }
        }
    }
}

