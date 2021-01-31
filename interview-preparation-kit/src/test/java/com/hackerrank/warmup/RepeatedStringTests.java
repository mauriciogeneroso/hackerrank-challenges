package com.hackerrank.warmup;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTests {

    private RepeatedString repeatedString = new RepeatedString();

    @Test
    public void test1() {
        // Arrange
        String s = "aba";
        long l = 10;

        // Act
        long result = repeatedString.repeatedString(s, l);

        // Assert
        Assert.assertEquals(7, result);
    }
}
