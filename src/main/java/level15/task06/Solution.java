package ru.javarush.java.core.level15.task06;

public class Solution {
    public static void main(String[] args) {
        MagicCalculator calculator = new MagicCalculator();

        // Вызываем публичный метод сложения и сохраняем результат
        int sum = calculator.addNumbers(10, 15);

        // Выводим сумму на экран
        System.out.println(sum);

        // Попытка вызвать приватный метод извне класса приведет к ошибке компиляции.
        calculator.displayInternalResult(sum); // Ошибка: displayInternalResult(int) has private access in MagicCalculator
    }
}