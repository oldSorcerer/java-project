package ru.javarush.java.core.level65.task09;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа Object и "кладем" в нее обычную строку
        Object unknownData = "Это пример текстовой строки";

        // Используем pattern matching для instanceof (Java 16+):
        // если unknownData — строка, одновременно объявляется переменная textValue

            // Внутри этого блока textValue видна — печатаем длину строки



        // После блока if переменная textValue больше не видна (вне области видимости).
         // Ошибка: cannot find symbol (переменная textValue не видна здесь)

        // Дополнительно выведем исходный объект, чтобы программа делала что-то и вне if.
        System.out.println(unknownData);
    }
}