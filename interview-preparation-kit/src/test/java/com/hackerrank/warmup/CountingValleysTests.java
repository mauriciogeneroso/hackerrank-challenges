package com.hackerrank.warmup;

import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTests {

    private CountingValleys countingValleys = new CountingValleys();

    @Test
    public void algorithm_test(){
        // Arrange
        String steps = "UDDDUDUU";

        // Act
        int result = countingValleys.countingValleys(steps.length(), steps);

        // Assert
        Assert.assertEquals(1, result);
    }
}
