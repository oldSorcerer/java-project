package ru.javarush.java.core.level23.task16;

// Точка входа: "нанимаем" программиста и даём ему задания
public class Solution {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Алиса");

        // Поручаем работу и сдачу отчёта
        programmer.work();
        programmer.report();
    }
}