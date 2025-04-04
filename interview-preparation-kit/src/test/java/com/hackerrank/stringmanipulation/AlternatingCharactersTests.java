package com.hackerrank.stringmanipulation;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlternatingCharactersTests {

    private final AlternatingCharacters alternatingCharacters = new AlternatingCharacters();

    @Test
    void alternatingCharacters_example1() {
        // Arrange
        String s = "AAABBBAABB";

        // Act
        int result = alternatingCharacters.alternatingCharacters(s);

        // Assert
        assertEquals(6, result);
    }
}
