package com.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingValleysTests {

    private final CountingValleys countingValleys = new CountingValleys();

    @Test
    public void algorithm_test() {
        // Arrange
        String steps = "UDDDUDUU";

        // Act
        int result = countingValleys.countingValleys(steps.length(), steps);

        // Assert
        assertEquals(1, result);
    }
}
