package ru.javarush.java.core.level18.task14;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив, способный хранить объекты типа Employee
        Employee[] team = new Employee[2];

        // Добавляем в массив по одному объекту Manager и Developer
        team[0] = new Manager();
        team[1] = new Developer();

        // Полиморфный вызов: метод work() вызывается у ссылки типа Employee,
        // но выполняется переопределенная версия соответствующего класса
        for (Employee employee : team) {
            employee.work();
        }
    }
}