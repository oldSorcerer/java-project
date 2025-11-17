package ru.javarush.java.core.level21.task12;

// Демонстрация разрешения конфликта default-методов при множественной реализации интерфейсов.
public class Solution {
    public static void main(String[] args) {
        C c = new C();
        c.show(); // Должно вывести: A (с новой строки) затем B
    }
}