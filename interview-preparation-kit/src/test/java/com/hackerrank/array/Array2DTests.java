package com.hackerrank.array;

import org.junit.Assert;
import org.junit.Test;

public class Array2DTests {

    private Array2D array2D = new Array2D();

    @Test
    public void hourglasssum_example1(){
        // Arrange
        int[][] array = new int[][] {
            { 1, 1, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0 },
            { 1, 1, 1, 0, 0, 0 },
            { 0, 0, 2, 4, 4, 0 },
            { 0, 0, 0, 2, 0, 0 },
            { 0, 0, 1, 2, 4, 0 }
        };

        // Act
        int maxSum = array2D.hourglassSum(array);

        // Assert
        Assert.assertEquals(19, maxSum);
    }

    @Test
    public void hourglasssum_example2(){
        // Arrange
        int[][] array = new int[][] {
            { 1, 1, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0 },
            { 1, 1, 1, 0, 0, 0 },
            { 0, 9, 2, -4, -4, 0 },
            { 0, 0, 0, -2, 0, 0 },
            { 0, 0, -1, -2, -4, 0 }
        };

        // Act
        int maxSum = array2D.hourglassSum(array);

        // Assert
        Assert.assertEquals(13, maxSum);
    }

    @Test
    public void hourglasssum_example3(){
        // Arrange
        int[][] array = new int[][] {
            { -9, -9, -9, 1, 1, 1 },
            { 0, -9, 0, 4, 3, 2 },
            { -9, -9, -9, 1, 2, 3 },
            { 0, 0, 8, 6, 6, 0 },
            { 0, 0, 0, -2, 0, 0 },
            { 0, 0, 1, 2, 4, 0 }
        };

        // Act
        int maxSum = array2D.hourglassSum(array);

        // Assert
        Assert.assertEquals(28, maxSum);
    }
}
