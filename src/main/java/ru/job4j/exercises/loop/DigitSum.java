package ru.job4j.exercises.loop;
/*
Дано число, нужно получить сумму его цифр
Например,
12 => 1 + 2 => 3
 */

public class DigitSum {
    public static int sum(int n) {
        int result = 0;
        while (n != 0) {
            result += (n % 10);
            n /= 10;
        }
        
        return result;
    }
}
