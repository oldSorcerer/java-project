package ru.javarush.java.core.level18.task16;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив базового типа Employee на 5 элементов.
        // Оставляем один свободный слот под будущего сотрудника (стажёра),
        // чтобы добавить его в тот же самый массив без пересоздания.
        Employee[] staff = new Employee[5];

        // Текущий штат: базовый сотрудник и три наследника.
        staff[0] = new Employee();
        staff[1] = new Manager();
        staff[2] = new Developer();
        staff[3] = new Designer();

        // Один и тот же цикл (внутри метода) вызывает work() у каждого сотрудника.
        printWorkForAll(staff);

        // Компания нанимает стажёра: добавляем его в тот же массив.
        staff[4] = new Intern();

        // Тот же цикл без изменений корректно обрабатывает новый тип сотрудника.
        printWorkForAll(staff);
    }

    // Универсальная логика обхода массива сотрудников
    private static void printWorkForAll(Employee[] staff) {
        for (Employee e : staff) {
            if (e != null) {          // пропускаем незаполненные ячейки
                e.work();             // полиморфный вызов: выбирается реализация по фактическому типу объекта
            }
        }
    }
}