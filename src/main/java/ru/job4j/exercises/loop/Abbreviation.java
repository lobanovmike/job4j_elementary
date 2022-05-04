package ru.job4j.exercises.loop;

/*
Аббревиатуры стали неотъемлемой частью нашей жизни. Мы очень часто используем и много какие выражения сокращаем,
забирая от каждого слова только первую букву - именно так формируются аббревиатуры.

Метод принимает строку, которая состоит из нескольких слов каждое из которых начинается с прописной буквы.
Необходимо из полученной строки сформировать аббревиатуру.

Для формирования новой строки используйте StringBuilder и его метод append().
 */
public class Abbreviation {
    public static String collect(String s) {
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
