package ru.javarush.java.core.level22.task08;

// Демонстрация: record неизменяем по структуре, но может хранить ссылку на изменяемый массив.
public class Solution {
    public static void main(String[] args) {
        // Создаем исходный массив показаний датчиков
        int[] readings = {10, 20, 30};

        // Передаем массив в record-объект (сохраняется та же ссылка на массив)
        IntArrayRecord container = new IntArrayRecord(readings);

        // Меняем первый элемент исходного массива
        readings[0] = 99;

        // Берем первый элемент из массива внутри record и выводим его
        System.out.println(container.values()[0]); // ожидаемый вывод: 99
    }
}