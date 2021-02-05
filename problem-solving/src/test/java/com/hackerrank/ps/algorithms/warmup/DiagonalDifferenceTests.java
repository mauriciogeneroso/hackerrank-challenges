package com.hackerrank.ps.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifferenceTests {

    @Test
    public void test() {
        List<Integer> row1 = Arrays.asList(11,2,4);
        List<Integer> row2 = Arrays.asList(4,5,6);
        List<Integer> row3 = Arrays.asList(10,8,-12);


        int result = DiagonalDifference.diagonalDifference(Arrays.asList(row1, row2, row3));

        Assertions.assertEquals(15, result);
    }
}
