package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int el = 5;
        int[] data = new int[] {5, 4, 3, 2};
        int result = FindLoop.indexOf(data, el);
        int excepted = 0;
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int el = 10;
        int[] data = new int[] {2, 5, 8, 23, 12, 6};
        int result = FindLoop.indexOf(data, el);
        int excepted = -1;
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenArrayHas14Then3() {
        int el = 14;
        int[] data = new int[] {3, 7, 14, 1, 8, 15};
        int result = FindLoop.indexOf(data, el);
        int excepted = 2;
        Assert.assertEquals(excepted, result);
    }
}