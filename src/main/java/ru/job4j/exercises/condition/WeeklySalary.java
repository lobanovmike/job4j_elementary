package ru.job4j.exercises.condition;
/*
Метод принимает массив целочисленных значений, при этом каждый элемент массива означает количество часов,
которые работник отработал в каждый день недели. Работник может работать и в выходные. При этом оплачивается труд
следующим образом:
1. В течение первых 8 часов каждый рабочий день за каждый час зарплата составляет 10 долларов.
2. За каждый отработанный час сверх нормы (8 часов) работник зарабатывает 15 долларов.
3. В выходные дни работодатель платит в два раза больше, как за каждый час по норме(первые 8 часов), так и сверхурочные.
Необходимо реализовать метод, который посчитает общую сумму заработка за отработанную неделю.
 */

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        int daySalary = 0;
        boolean weekend = false;
        for (int i = 0; i < hours.length; i++) {
            if (i >= hours.length - 2) {
                weekend = true;
            }
            if (hours[i] > 8) {
                daySalary = 80 + (hours[i] - 8) * 15;
                if (weekend) {
                    daySalary *= 2;
                }
                salary += daySalary;
            } else {
                daySalary = hours[i] * 10;
                if (weekend) {
                    daySalary *= 2;
                }
                salary += daySalary;
            }
        }
        return salary;
    }
}
