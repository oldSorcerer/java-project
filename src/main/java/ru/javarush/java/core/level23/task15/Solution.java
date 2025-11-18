package ru.javarush.java.core.level23.task15;

public class Solution {
    public static void main(String[] args) {
        // Полиморфная переменная базового типа "Appliance"
        Appliance homeAppliance = new Kettle();

        // Перед вызовом специфичного метода проверяем реальный тип прибора
        if (homeAppliance instanceof Kettle) {
            // Безопасное приведение типа после instanceof
            Kettle kettle = (Kettle) homeAppliance;
            kettle.boil(); // Выведет: "Вода закипела"
        }
    }
}