package ru.javarush.java.core.level54.task02;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        // Общий инструмент, которым пользуются обе "руки"
        CentralTool tool = new CentralTool();

        // Создаем два потока — две "руки" с уникальными идентификаторами
        Thread arm1 = new Thread(new Arm("Logger-1", tool), "Logger-1");
        Thread arm2 = new Thread(new Arm("Logger-2", tool), "Logger-2");

        // Запускаем работу обеих рук
        arm1.start();
        arm2.start();

        // Дожидаемся завершения работы обоих потоков
        arm1.join();
        arm2.join();
    }
}