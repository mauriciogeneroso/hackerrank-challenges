package com.hackerrank.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MakingAnagramsTests {

    private final MakingAnagrams makingAnagrams = new MakingAnagrams();

    @Test
    void makingAnagrams_example1() {
        // Arrange
        String a = "cde";
        String b = "abc";

        // Act
        int minDeletion = makingAnagrams.makeAnagram(a, b);

        // Assert
        assertEquals(4, minDeletion);
    }

    @Test
    void makingAnagrams_example2() {
        // Arrange
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        // Act
        int minDeletion = makingAnagrams.makeAnagram(a, b);

        // Assert
        assertEquals(30, minDeletion);
    }

    // Second solution
    @Test
    void makingAnagrams_example3() {
        // Arrange
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        // Act
        int minDeletion = makingAnagrams.numberNeeded(a, b);

        // Assert
        assertEquals(30, minDeletion);
    }
}
