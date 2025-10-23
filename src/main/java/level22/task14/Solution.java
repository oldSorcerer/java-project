package ru.javarush.java.core.level22.task14;

public class Solution {
    public static void main(String[] args) {
        // 1) Корректный email — создаем и выводим
        Email good = new Email("student@example.com");
        System.out.println("Создан корректный адрес: " + good.address());

        // 2) Некорректный email — без символа '@'
        // Эта строка выбросит IllegalArgumentException с сообщением из конструктора и завершит программу
        Email bad = new Email("student.example.com");

        // До этой строки выполнение не дойдет
        System.out.println(bad.address());
    }
}