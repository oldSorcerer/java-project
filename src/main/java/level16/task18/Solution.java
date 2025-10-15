package ru.javarush.java.core.level16.task18;

// Класс "умной" коробки с обобщённым типом T
// Такой класс гарантирует типовую безопасность на этапе компиляции

    // Приватное поле для хранения содержимого коробки


    // Помещаем предмет в коробку


    // Извлекаем содержимое коробки


public class Solution {
    public static void main(String[] args) {
        // Создаём коробку, которая может хранить только целые числа (Integer)
        SmartBox<Integer> intBox = new SmartBox<>();

        // Помещаем число 42 (автобоксинг int -> Integer)
        intBox.store(42);

        // Извлекаем содержимое и выводим на экран
        Integer value = intBox.getContents();
        System.out.println(value);
    }
}