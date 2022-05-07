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

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

        @Test
        public void whenDiapasonHasNot8ThenMinus1() {
            int[] data = new int[] {3, 5, 7, 3, 2, 10, 34, 23};
            int el = 8;
            int start = 2;
            int finish = 5;
            int result = FindLoop.indexInRange(data, el, start, finish);
            int expected = -1;
            Assert.assertEquals(expected, result);
        }

        @Test
    public void whenDiapasonHas5Than4() {
        int[] data = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 5};
        int el = 5;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
        }
}