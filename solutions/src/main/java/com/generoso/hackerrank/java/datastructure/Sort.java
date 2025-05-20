package com.generoso.hackerrank.java.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort((o1, o2) -> {
            if (o1.getCgpa() < o2.getCgpa()) {
                return 1;
            } else if (o1.getCgpa() > o2.getCgpa()) {
                return -1;
            }

            int nameOrder = o1.getName().compareTo(o2.getName());
            if (nameOrder == 0) {
                return Integer.compare(o1.getId(), o2.getId());
            }

            return nameOrder;
        });
        for (Student st : studentList) {
            System.out.println(st.getName());
        }
    }
}
