package ru.javarush.java.core.level62.task09;

import java.lang.reflect.Field;

public class Solution {
    public static void main(String[] args) {
        Car car = assembleCar(); // "Умная" сборка
        // Наглядная проверка: двигатель должен быть внедрён
        System.out.println(car.getEngine() != null ? "Engine injected!" : "Engine is null :(");
    }

    // Метод автоматической сборки:
    public static Car assembleCar() {
        // Создаём объект с помощью публичного конструктора без параметров


        // Обходим все объявленные поля класса Car

            // Проверяем наличие @Inject

                    // Разрешаем доступ к приватному полю
                    // Создаём новый объект нужного типа (в нашем случае это Engine),
                    // используя его конструктор без параметров

                    // Внедряем созданный объект в поле car

                    // Для учебной задачи достаточно бросить непроверяемое исключение




    }
}