package ru.javarush.java.core.level15.task06;

public class MagicCalculator {
    public int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private void displayInternalResult(int calculationResult) {
        System.out.println( "Внутренний результат: " + calculationResult);
    }
}
