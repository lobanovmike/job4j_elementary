package ru.job4j.exercises.condition;
/*
1. год, номер которого кратен 400 - високосный;
2. остальные годы, номер которых кратен 100 - невисокосные (1700, 1800, 1900, 2100)
3. остальные годы, номер которых кратен 4 - високосные.

если (год % 400 == 0) -> истина
    иначе если (год % 100 == 0) -> ложь

 */
public class LeapYear {
    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
