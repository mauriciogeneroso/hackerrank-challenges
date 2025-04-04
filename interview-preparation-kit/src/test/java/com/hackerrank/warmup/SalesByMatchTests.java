package com.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesByMatchTests {

    private final SalesByMatch salesByMatch = new SalesByMatch();

    @Test
    public void algorithm1_testCase1() {
        // Arrange
        int[] ar = {1, 2, 1, 2, 1, 3, 2}; // pairs

        // Act
        int numberOgMatchingPairs = salesByMatch.sockMerchant(ar.length, ar);

        // Assert
        assertEquals(2, numberOgMatchingPairs);
    }

    @Test
    void algorithm1_testCase2() {
        // Arrange
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3}; // pairs

        // Act
        int numberOgMatchingPairs = salesByMatch.sockMerchant(ar.length, ar);

        // Assert
        assertEquals(4, numberOgMatchingPairs);
    }

    @Test
    void algorithm1_testCase3() {
        // Arrange
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20}; // pairs

        // Act
        int numberOgMatchingPairs = salesByMatch.sockMerchant(ar.length, ar);

        // Assert
        assertEquals(3, numberOgMatchingPairs);
    }

    @Test
    void algorithm2_testCase1() {
        // Arrange
        int[] ar = {1, 2, 1, 2, 1, 3, 2}; // pairs

        // Act
        int numberOgMatchingPairs = salesByMatch.sockMerchant2(ar.length, ar);

        // Assert
        assertEquals(2, numberOgMatchingPairs);
    }

    @Test
    void algorithm2_testCase2() {
        // Arrange
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3}; // pairs

        // Act
        int numberOgMatchingPairs = salesByMatch.sockMerchant2(ar.length, ar);

        // Assert
        assertEquals(4, numberOgMatchingPairs);
    }

    @Test
    void algorithm2_testCase3() {
        // Arrange
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20}; // pairs

        // Act
        int numberOgMatchingPairs = salesByMatch.sockMerchant2(ar.length, ar);

        // Assert
        assertEquals(3, numberOgMatchingPairs);
    }

    @Test
    void algorithm4_testCase1() {
        // Arrange
        int[] ar = {1, 2, 1, 2, 1, 3, 2}; // pairs

        // Act
        int numberOgMatchingPairs = salesByMatch.sockMerchant4(ar.length, ar);

        // Assert
        assertEquals(2, numberOgMatchingPairs);
    }

    @Test
    void algorithm4_testCase2() {
        // Arrange
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3}; // pairs

        // Act
        int numberOgMatchingPairs = salesByMatch.sockMerchant4(ar.length, ar);

        // Assert
        assertEquals(4, numberOgMatchingPairs);
    }

    @Test
    void algorithm4_testCase3() {
        // Arrange
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20}; // pairs

        // Act
        int numberOgMatchingPairs = salesByMatch.sockMerchant4(ar.length, ar);

        // Assert
        assertEquals(3, numberOgMatchingPairs);
    }
}
