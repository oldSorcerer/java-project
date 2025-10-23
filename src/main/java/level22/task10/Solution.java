package ru.javarush.java.core.level22.task10;

public class Solution {
    public static void main(String[] args) {
        // Создаем две точки с абсолютно одинаковыми координатами
        Point point1 = new Point(40.7128, -74.0060);
        Point point2 = new Point(40.7128, -74.0060);

        // Сравнение объектов через equals (метод автоматически сгенерирован у record)
        boolean equalsResult = point1.equals(point2);

        // Сравнение их хеш-кодов (hashCode тоже автогенерируется у record)
        boolean sameHash = point1.hashCode() == point2.hashCode();

        // Выводим оба результата: ожидается true и true
        System.out.println(equalsResult);
        System.out.println(sameHash);
    }
}