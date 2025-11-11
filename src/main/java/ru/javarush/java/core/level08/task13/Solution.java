package ru.javarush.java.core.level08.task13;

public class Solution {

    // Метод для сброса начальной точки траектории робота
    public static void resetRobotStart(int[] trajectoryPath) {
        // Устанавливаем первый элемент массива равным 0
        
    }

    public static void main(String[] args) {
        // Создаем массив initialPath с начальными значениями
        int[] initialPath = {3, 4, 5};

        // Вызываем метод resetRobotStart, передавая массив initialPath
        resetRobotStart(initialPath);

        // Выводим значение первого элемента массива initialPath
        System.out.println(initialPath[0]); // Ожидаемый вывод: 0
    }
}