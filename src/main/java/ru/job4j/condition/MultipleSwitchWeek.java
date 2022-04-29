package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Monday", "Понедельник" -> 1;
            case "Tuesday", "Вторник" -> 2;
            case "Wednesday", "Среда" -> 2;
            case "Thursday", "Четверг" -> 2;
            case "Friday", "Пятница" -> 2;
            case "Saturday", "Суббота" -> 2;
            case "Sunday", "Воскресенье" -> 2;
            default -> -1;
        };
    }
}
