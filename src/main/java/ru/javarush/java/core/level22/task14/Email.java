package ru.javarush.java.core.level22.task14;

public record Email(String address) {
    public Email {
        if (address == null || address.isBlank() || !address.contains("@")) {
            throw new IllegalArgumentException("Некорректный email: строка не должна быть null/пустой и обязана содержать символ '@'");
        }
    }
}
