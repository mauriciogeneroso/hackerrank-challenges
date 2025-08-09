package com.generoso.hackerrank.interviewpreparationkit.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedStringTests {

    private final RepeatedString repeatedString = new RepeatedString();

    @Test
    void test1() {
        // Arrange
        String s = "aba";
        long l = 10;

        // Act
        long result = repeatedString.repeatedString(s, l);

        // Assert
        assertEquals(7, result);
    }
}
