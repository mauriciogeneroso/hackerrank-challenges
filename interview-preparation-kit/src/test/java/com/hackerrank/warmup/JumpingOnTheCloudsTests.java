package com.hackerrank.warmup;

import org.junit.Assert;
import org.junit.Test;

public class JumpingOnTheCloudsTests {

    private JumpingOnTheClouds jumpingOnTheClouds = new JumpingOnTheClouds();

    @Test
    public void algorithm1_test1() {
        // Arrange
        int[] sequence = new int[]{0, 0, 1, 0, 0, 1, 0};

        // Act
        int result = jumpingOnTheClouds.jumpingOnClouds(sequence);

        // Assert
        Assert.assertEquals(4, result);
    }

    @Test
    public void algorithm1_test2() {
        // Arrange
        int[] sequence = new int[]{0, 0, 0, 0, 1, 0};

        // Act
        int result = jumpingOnTheClouds.jumpingOnClouds(sequence);

        // Assert
        Assert.assertEquals(3, result);
    }

    @Test
    public void algorithm2_test1() {
        // Arrange
        int[] sequence = new int[]{0, 0, 1, 0, 0, 1, 0};

        // Act
        int result = jumpingOnTheClouds.jumpingOnClouds2(sequence);

        // Assert
        Assert.assertEquals(4, result);
    }

    @Test
    public void algorithm2_test2() {
        // Arrange
        int[] sequence = new int[]{0, 0, 0, 0, 1, 0};

        // Act
        int result = jumpingOnTheClouds.jumpingOnClouds2(sequence);

        // Assert
        Assert.assertEquals(3, result);
    }
}
