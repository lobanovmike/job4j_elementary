package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int excepted = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(excepted, out);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int excepted = 5;
        int out = Max.max(left, right);
        Assert.assertEquals(excepted, out);
    }

    @Test
    public void whenMax4To8Then8() {
        int left = 4;
        int right = 8;
        int excepted = 8;
        int out = Max.max(left, right);
        Assert.assertEquals(excepted, out);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int excepted = 3;
        int out = Max.max(left, right);
        Assert.assertEquals(excepted, out);
    }
}