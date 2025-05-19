package com.generoso.hackerrank.java.datastructure;

import java.util.*;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> uniqueValues = new HashSet<>();

        int n = scan.nextInt();
        int m = scan.nextInt();

        int maxUnique = 0;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();

            deque.addLast(num);
            uniqueValues.add(num);

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, uniqueValues.size());

                int removed = deque.removeFirst();
                if (!deque.contains(removed)) {
                    uniqueValues.remove(removed);
                }
            }
        }

        System.out.println(maxUnique);
    }
}
