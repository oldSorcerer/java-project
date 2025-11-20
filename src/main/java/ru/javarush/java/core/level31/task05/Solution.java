package ru.javarush.java.core.level31.task05;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Создаем список сотрудников согласно условию задачи
        List<Employee> employees = List.of(
                new Employee("Alice", "IT"),
                new Employee("Bob", "HR"),
                new Employee("Clara", "IT"),
                new Employee("Denis", "Finance"),
                new Employee("Eva", "HR")
        );

        // Используем Stream API и Collectors.groupingBy для группировки по отделам.
        // В значения сразу собираем только имена сотрудников (downstream-коллектор mapping).
        // LinkedHashMap сохраняет порядок отделов по первому появлению в исходном списке.


        // Выводим для каждого отдела список имен сотрудников

    }
}

// Простой класс-сущность сотрудника с двумя полями и геттерами
class Employee {
    private final String employeeName;
    private final String departmentName;

    public Employee(String employeeName, String departmentName) {
        this.employeeName = employeeName;
        this.departmentName = departmentName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}