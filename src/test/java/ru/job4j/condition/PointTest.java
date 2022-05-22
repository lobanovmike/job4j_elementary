package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to33then2dot82() {
        double expected = 2.82;
        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 3);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to33then1dot41() {
        double expected = 1.41;
        Point point1 = new Point(2, 2);
        Point point2 = new Point(3, 3);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to55then2dot82() {
        double expected = 2.82;
        Point point1 = new Point(3, 3);
        Point point2 = new Point(5, 5);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}