package ru.javarush.java.core.level23.task08;

public class Solution {
    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        long value = 5L; // Явно используем тип long

        // Здесь Java выберет перегрузку print(double),
        demo.print(value); // Ожидаемый вывод: "double: 5.0"
    }
}