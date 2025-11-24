package ru.javarush.java.core.level22.task15;

public record Person(String name, int age) {
    public static final String SPECIES = "Homo sapiens";

    public String greeting() {
        return "Привет, меня зовут %s, мне %d лет. Я — %s".formatted(name, age, SPECIES);
    }
}
