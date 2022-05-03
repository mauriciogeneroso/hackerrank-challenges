package com.hackerrank.stringmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class AlternatingCharactersTests {

    private AlternatingCharacters alternatingCharacters = new AlternatingCharacters();

    @Test
    public void alternatingCharacters_example1() {
        // Arrange
        String s = "AAABBBAABB";

        // Act
        int result = alternatingCharacters.alternatingCharacters(s);

        // Assert
        Assert.assertEquals(6, result);
    }
}
