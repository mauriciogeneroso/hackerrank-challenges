package com.generoso.hackerrank.tendaysofstatistics;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Day1Quartiles {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> data = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> res = quartiles(data);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static List<Integer> quartiles(List<Integer> arr) {
        Collections.sort(arr);
        int n = arr.size();

        int q2 = (int) median(arr);

        List<Integer> lowerHalf = arr.subList(0, n / 2);
        List<Integer> upperHalf = (n % 2 == 0) ? arr.subList(n / 2, n) : arr.subList(n / 2 + 1, n);

        int q1 = (int) median(lowerHalf);
        int q3 = (int) median(upperHalf);

        return Arrays.asList(q1, q2, q3);
    }

    private static double median(List<Integer> list) {
        int mid = list.size()/ 2;
        if (list.size() % 2 == 0) {
            return (list.get(mid - 1) + list.get(mid)) / 2.0;
        }

        return list.get(mid);
    }
}
