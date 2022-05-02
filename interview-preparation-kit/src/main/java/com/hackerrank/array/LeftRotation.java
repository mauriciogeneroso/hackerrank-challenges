package com.hackerrank.array;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

    public int[] rotLeft(int[] a, int d) {
        if (a.length == d) {
            return a;
        }

        for (int i = 0; i < d; i++) {
            int first = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = first;
        }

        return a;
    }

    public int[] rotLeft2(int[] array, int r) {
        for (int i = 0; i < r; i++) {
            int first = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = first;
        }

        return array;
    }

    /*
        Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
            1) Store the first d elements in a temp array
                temp[] = [1, 2]
            2) Shift rest of the arr[]
                arr[] = [3, 4, 5, 6, 7, 6, 7]
            3) Store back the d elements
                arr[] = [3, 4, 5, 6, 7, 1, 2]
     */
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        if (a.size() == d) {
            return a;
        }

        if (d > a.size()) {
            d %= a.size();
        }

        List<Integer> tempList = new ArrayList<>(a.subList(0, d));

        List<Integer> newList = new ArrayList<>();
        newList.addAll(a.subList(d, a.size()));
        newList.addAll(tempList);

        return newList;
    }
}