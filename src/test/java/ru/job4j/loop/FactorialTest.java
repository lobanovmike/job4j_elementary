package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int excepted = 120;
        int result = Factorial.calc(in);
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int excepted = 1;
        int result = Factorial.calc(in);
        Assert.assertEquals(excepted, result);
    }
}