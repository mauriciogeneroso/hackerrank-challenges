package com.generoso.hackerrank.java.datastructure;

import java.util.*;

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Priorities {

    private final Comparator<Student> studentComparator = Comparator
            .comparingDouble(Student::getCgpa).reversed()
            .thenComparing(Student::getName)
            .thenComparingInt(Student::getId);

    public List<Student> getStudents(List<String> events) {
        Queue<Student> students = new PriorityQueue<>(studentComparator);

        for (String eventInput : events) {
            String[] inputs = eventInput.split(" ");

            String event = inputs[0];
            if (event.equals("ENTER")) {
                String name = inputs[1];
                double cgpa = Double.parseDouble(inputs[2]);
                int id = Integer.parseInt(inputs[3]);
                students.add(new Student(id, name, cgpa));
            } else {
                students.poll();
            }
        }

        List<Student> result = new ArrayList<>();
        while (!students.isEmpty()) {
            result.add(students.poll());
        }
        return result;
    }

}