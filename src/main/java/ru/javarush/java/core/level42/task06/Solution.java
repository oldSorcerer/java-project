package ru.javarush.java.core.level42.task06;

import java.io.*;

// Решение задачи: сериализация и десериализация объекта Person в бинарный файл
public class Solution {

    // Класс Person "сериализуемый" — реализует Serializable
    public static class Person  {
        // Поля по требованию задачи
        String historianName;
        int historianAge;

        public Person(String historianName, int historianAge) {
            this.historianName = historianName;
            this.historianAge = historianAge;
        }
    }

    public static void main(String[] args) throws Exception {
        // 1) Создаем объект исторической личности
        Person historicalFigure = new Person("Геродот", 35);

        // 2) Сериализуем (архивируем) объект в файл person.bin


        // 3) Десериализуем (извлекаем) объект из файла person.bin

        
        // 4) Выводим результат в требуемом формате

    }
}