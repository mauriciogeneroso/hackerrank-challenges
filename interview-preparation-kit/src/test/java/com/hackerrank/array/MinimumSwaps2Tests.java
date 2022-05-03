package com.hackerrank.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MinimumSwaps2Tests {

    private MinimumSwaps2 minimumSwaps2 = new MinimumSwaps2();

    @Test
    public void minimumSwaps2_example1(){
        // Arrange
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);

        // Act
        String result = minimumSwaps2.minimumBribes(list);

        // Assert
        Assert.assertEquals("3", result);
    }

    @Test
    public void minimumSwaps2_example2(){
        // Arrange
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);

        // Act
        String result = minimumSwaps2.minimumBribes(list);

        // Assert
        Assert.assertEquals("Too chaotic", result);
    }

    @Test
    public void minimumSwaps2_example3(){
        // Arrange
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(4);

        // Act
        String result = minimumSwaps2.minimumBribes(list);

        // Assert
        Assert.assertEquals("Too chaotic", result);
    }

    @Test
    public void minimumSwaps2_example4(){
        // Arrange
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(4);

        // Act
        String result = minimumSwaps2.minimumBribes(list);

        // Assert
        Assert.assertEquals("7", result);
    }

    @Test
    public void minimumSwaps2_example5(){
        // Arrange
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(6);

        // Act
        String result = minimumSwaps2.minimumBribes(list);

        // Assert
        Assert.assertEquals("4", result);
    }
}
