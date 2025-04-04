package com.hackerrank.array;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LeftRotationTests {

    private final LeftRotation leftRotation = new LeftRotation();

    @Test
    void leftrotation_example1() {
        // Arrange
        int[] array = new int[]{1, 2, 3, 4, 5};

        // Act
        int[] result = leftRotation.rotLeft(array, 4);

        // Assert
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, result);
    }

}
