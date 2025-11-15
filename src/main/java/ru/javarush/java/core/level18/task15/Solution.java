package ru.javarush.java.core.level18.task15;

// Демонстрация полиморфизма: добавили новый тип сотрудника Tester,
// и система без изменений логики main корректно вызывает его работу.
public class Solution {
    public static void main(String[] args) {
        // Создаем массив ссылок базового типа Employee
        Employee[] team = {
                new Manager(),
                new Developer(),
                new Tester() // новый тип сотрудника
        };

        // Полиморфный вызов: у каждого элемента массива вызывается свой вариант work()
        for (Employee e : team) {
            e.work();
        }
    }
}