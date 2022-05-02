package com.hackerrank.array;

import org.junit.Assert;
import org.junit.Test;

public class LeftRotationTests {

    private LeftRotation leftRotation = new LeftRotation();

    @Test
    public void leftrotation_example1(){
        // Arrange
        int[] array = new int[] {1, 2, 3, 4, 5};

        // Act
        int[] result = leftRotation.rotLeft(array, 4);

        // Assert
        Assert.assertArrayEquals(new int[] {5, 1, 2, 3, 4}, result);
    }

}
