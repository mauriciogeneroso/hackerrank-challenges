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

//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scan = new Scanner(System.in);
//
//        String returnedDateInput = scan.nextLine();
//        String returnDateInput = scan.nextLine();
//
//        String[] returnedDateParts = returnedDateInput.split("\\s");
//        String[] returnDateParts = returnDateInput.split("\\s");
//
//        LocalDate returnedDate = LocalDate.of(
//                Integer.parseInt(returnedDateParts[2]),
//                Integer.parseInt(returnedDateParts[1]),
//                Integer.parseInt(returnedDateParts[0])
//        );
//
//        LocalDate returnDate = LocalDate.of(
//                Integer.parseInt(returnDateParts[2]),
//                Integer.parseInt(returnDateParts[1]),
//                Integer.parseInt(returnDateParts[0])
//        );
//
//        if (returnedDate.isBefore(returnDate) || returnedDate == returnDate) {
//            System.out.println("0");
//        } else if (returnedDate.getMonth() == returnDate.getMonth() && returnedDate.getYear() == returnDate.getYear()) {
//            System.out.print(15 * (returnedDate.getDayOfMonth() - returnDate.getDayOfMonth()));
//        } else if (returnedDate.getYear() == returnDate.getYear()) {
//            System.out.println(500 * (returnedDate.getMonthValue() - returnDate.getMonthValue()));
//        } else {
//            System.out.println("10000");
//        }
//    }
}

