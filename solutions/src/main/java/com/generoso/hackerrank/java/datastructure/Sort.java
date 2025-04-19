package com.generoso.hackerrank.java.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private final int id;
    private final String fname;
    private final double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

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

            int nameOrder = o1.getFname().compareTo(o2.getFname());
            if (nameOrder == 0) {
                return Integer.compare(o1.getId(), o2.getId());
            }

            return nameOrder;
        });
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
