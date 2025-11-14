package ru.javarush.java.core.level16.task15;

public class SpecialCalculator {

    // Метод, который мгновенно выводит сумму numA и numB на экран
    public void calculateAndDisplaySum(int numA, int numB) {
        // Локальный класс — временный «модуль» отображения результата.
        // Он объявлен внутри метода и имеет доступ к его параметрам (они эффективно final).
        class SumResultPrinter {
            public void printResult() {
                System.out.println(numA + numB);
            }
        }

        // Создаем объект локального класса и сразу же выводим результат
        SumResultPrinter sumResultPrinter = new SumResultPrinter();
        sumResultPrinter.printResult();
    }
}