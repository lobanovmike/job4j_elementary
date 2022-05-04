package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class MortgageTest {

    @Test
    public void when1Year() {
        double amount = 1000;
        double salary = 1200;
        double percent = 1;
        int expected = 1;
        int result = Mortgage.year(amount, salary, percent);
        Assert.assertEquals(expected, result, 0.001);
    }

    @Test
    public void when2Year() {
        double amount = 100;
        double salary = 120;
        double percent = 50;
        int expected = 2;
        int result = Mortgage.year(amount, salary, percent);
        Assert.assertEquals(expected, result, 0.001);
    }
}