package ru.javarush.java.core.level18.task19;

public class Solution {
    public static void main(String[] args) {
        // Массив ссылок базового типа — хранит разнородных сотрудников
        Employee[] team = new Employee[2];

        // Добавляем по одному объекту каждого типа
        team[0] = new Manager();
        team[1] = new Developer();

        // Полиморфизм: один и тот же вызов work() ведет себя по-разному
        // в зависимости от реального типа объекта
        for (Employee employee : team) {
            employee.work();
        }
    }
}