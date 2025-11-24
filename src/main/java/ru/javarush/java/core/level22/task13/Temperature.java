package ru.javarush.java.core.level22.task13;

public record Temperature(double celsius) {

    public static Temperature fromFahrenheit(double fahrenheit) {
        return new Temperature((fahrenheit - 32) * 5 / 9 );
    }
}
