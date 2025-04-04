package com.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpingOnTheCloudsTests {

    private final JumpingOnTheClouds jumpingOnTheClouds = new JumpingOnTheClouds();

    @Test
    public void algorithm1_test1() {
        // Arrange
        int[] sequence = new int[]{0, 0, 1, 0, 0, 1, 0};

        // Act
        int result = jumpingOnTheClouds.jumpingOnClouds(sequence);

        // Assert
        assertEquals(4, result);
    }

    @Test
    void algorithm1_test2() {
        // Arrange
        int[] sequence = new int[]{0, 0, 0, 0, 1, 0};

        // Act
        int result = jumpingOnTheClouds.jumpingOnClouds(sequence);

        // Assert
        assertEquals(3, result);
    }

    @Test
    void algorithm2_test1() {
        // Arrange
        int[] sequence = new int[]{0, 0, 1, 0, 0, 1, 0};

        // Act
        int result = jumpingOnTheClouds.jumpingOnClouds2(sequence);

        // Assert
        assertEquals(4, result);
    }

    @Test
    void algorithm2_test2() {
        // Arrange
        int[] sequence = new int[]{0, 0, 0, 0, 1, 0};

        // Act
        int result = jumpingOnTheClouds.jumpingOnClouds2(sequence);

        // Assert
        assertEquals(3, result);
    }
}
