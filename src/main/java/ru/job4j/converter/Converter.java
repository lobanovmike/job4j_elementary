package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollars = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollars + " dollars.");

        float in = 210;
        float expected = 3;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("210 rubles are 3. Test result : " + passed);

        in = 120;
        expected = 2;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}
