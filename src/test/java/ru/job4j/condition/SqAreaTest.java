package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP16K3Square12() {
        int expected = 12;
        int p = 16;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K2Square32() {
        int excepted = 32;
        int p = 24;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }
}