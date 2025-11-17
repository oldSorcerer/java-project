package ru.javarush.java.core.level19.task08;

public class Solution {
    public static void main(String[] args) {
        // Массив базового типа Employee может хранить различные подклассы — это полиморфизм
        Employee[] staff = new Employee[2];

        // Добавляем тестовых сотрудников
        staff[0] = new Manager("Анна", 100000);
        staff[1] = new Developer("Иван", 500, 160);

        // Проходим по массиву и выводим имя и зарплату каждого сотрудника
        for (Employee e : staff) {
            System.out.println("Имя: " + e.getName() + ", зарплата: " + e.getSalary());
        }
    }
}