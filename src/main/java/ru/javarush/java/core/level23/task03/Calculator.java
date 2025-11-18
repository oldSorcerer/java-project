package ru.javarush.java.core.level23.task03;

public class Calculator {
    // Простой калькулятор: храним последний результат
    private int lastResult;

    // Публичный метод calculate() — точка выполнения вычислений
    public void calculate() {
        int a = 10;
        int b = 5;

        // Пример вычислений
        lastResult = a * b + (a - b);

        // код не скомпилируется, т.к. методы объявляются только внутри класса.


        printResult(); // выносим печать результата в отдельный метод уровня класса
    }

    // Метод объявлен на уровне класса (как и должно быть), а не внутри calculate()


    // Небольшая демонстрация работы
    public static void main(String[] args) {
        new Calculator().calculate();
    }
}