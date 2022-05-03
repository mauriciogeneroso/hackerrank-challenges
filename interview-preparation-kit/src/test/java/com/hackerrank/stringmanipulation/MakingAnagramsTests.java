package com.hackerrank.stringmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class MakingAnagramsTests {

    private MakingAnagrams makingAnagrams = new MakingAnagrams();

    @Test
    public void makingAnagrams_example1() {
        // Arrange
        String a = "cde";
        String b = "abc";

        // Act
        int minDeletion = makingAnagrams.makeAnagram(a, b);

        // Assert
        Assert.assertEquals(4, minDeletion);
    }

    @Test
    public void makingAnagrams_example2() {
        // Arrange
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        // Act
        int minDeletion = makingAnagrams.makeAnagram(a, b);

        // Assert
        Assert.assertEquals(30, minDeletion);
    }

    // Second solution
    @Test
    public void makingAnagrams_example3() {
        // Arrange
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        // Act
        int minDeletion = makingAnagrams.numberNeeded(a, b);

        // Assert
        Assert.assertEquals(30, minDeletion);
    }
}
