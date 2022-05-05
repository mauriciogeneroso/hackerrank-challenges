package com.hackerrank.stringmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class SherlockAndTheValidStringTests {

    private SherlockAndTheValidString sherlockAndTheValidString = new SherlockAndTheValidString();

    @Test
    public void string_valid_example1() {
        // Arrange
        String s = "aabbcd";

        // Act
        String isValid = sherlockAndTheValidString.isValid(s);

        // Assert
        Assert.assertEquals("NO", isValid);
    }

    @Test
    public void string_valid_example2() {
        // Arrange
        String s = "aabbccddeefghi";

        // Act
        String isValid = sherlockAndTheValidString.isValid(s);

        // Assert
        Assert.assertEquals("NO", isValid);
    }

    @Test
    public void string_valid_example3() {
        // Arrange
        String s = "abcdefghhgfedecba";

        // Act
        String isValid = sherlockAndTheValidString.isValid(s);

        // Assert
        Assert.assertEquals("NO", isValid);
    }

    @Test
    public void string_valid_example4() {
        // Arrange
        String s = "aaaabbcc";

        // Act
        String isValid = sherlockAndTheValidString.isValid(s);

        // Assert
        Assert.assertEquals("NO", isValid);
    }

    @Test
    public void string_valid_example5() {
        // Arrange
        String s = "aabbc";

        // Act
        String isValid = sherlockAndTheValidString.isValid(s);

        // Assert
        Assert.assertEquals("NO", isValid);
    }
}
