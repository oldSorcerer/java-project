package ru.javarush.java.core.level22.task03;

public class Solution {
    public static void main(String[] args) {
        // Создаем два объекта City с абсолютно одинаковыми значениями
        City city1 = new City("Paris", 2148327);
        City city2 = new City("Paris", 2148327);

        // В record equals автоматически сгенерирован и сравнивает компоненты по значению
        boolean areEqual = city1.equals(city2);

        // Выводим результат сравнения: true или false
        System.out.println(areEqual);
    }
}