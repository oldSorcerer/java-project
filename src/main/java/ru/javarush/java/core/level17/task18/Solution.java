package ru.javarush.java.core.level17.task18;

public class Solution {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printSecret(); // выведет 42 — корректный доступ через публичный метод

        // Вызов ниже демонстрационен. Сам файл не скомпилируется из-за ошибок в Child,
        new Child().demo();
    }
}