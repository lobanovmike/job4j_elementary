package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(1, 1, 3, 3);
        System.out.println("result (1, 1) to (3, 3) " + result);
        result = Point.distance(1, 0, 4, 5);
        System.out.println("result (1, 0) to (4, 5) " + result);
        }
}
