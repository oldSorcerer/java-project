package ru.javarush.java.core.level58.task08;

import java.util.concurrent.locks.StampedLock;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект с начальными координатами
        DronePosition position = new DronePosition(2.5, 3.7);

        // Вычисляем и выводим сумму координат
        double total = position.calculateTotalPosition();
        System.out.println(total); // Ожидаемый результат — 6.2
    }
}