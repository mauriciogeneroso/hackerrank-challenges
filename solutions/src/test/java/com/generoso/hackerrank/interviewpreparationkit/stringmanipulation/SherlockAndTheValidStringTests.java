package com.generoso.hackerrank.interviewpreparationkit.stringmanipulation;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SherlockAndTheValidStringTests {

    private final SherlockAndTheValidString sherlockAndTheValidString = new SherlockAndTheValidString();

    @Test
    void string_valid_example1() {
        // Arrange
        String s = "aabbcd";

        // Act
        String isValid = sherlockAndTheValidString.isValid(s);

        // Assert
        assertEquals("NO", isValid);
    }

    @Test
    void string_valid_example2() {
        // Arrange
        String s = "aabbccddeefghi";

        // Act
        String isValid = sherlockAndTheValidString.isValid(s);

        // Assert
        assertEquals("NO", isValid);
    }

    @Test
    @Disabled
    void string_valid_example3() {
        // Arrange
        String s = "abcdefghhgfedecba";

        // Act
        String isValid = sherlockAndTheValidString.isValid(s);

        // Assert
        assertEquals("NO", isValid);
    }

    @Test
    public void string_valid_example4() {
        // Arrange
        String s = "aaaabbcc";

        // Act
        String isValid = sherlockAndTheValidString.isValid(s);

        // Assert
        assertEquals("NO", isValid);
    }

    @Test
    @Disabled
    public void string_valid_example5() {
        // Arrange
        String s = "aabbc";

        // Act
        String isValid = sherlockAndTheValidString.isValid(s);

        // Assert
        assertEquals("NO", isValid);
    }
}
