package ru.javarush.java.core.level22.task16;

public class Solution {
    public static void main(String[] args) {
        // Создаем корректную транзакцию и выводим её описание
        Transaction ok = new Transaction("Иван Петров", "Мария Смирнова", 12500.75);
        System.out.println(ok.describe());

        // Пробуем создать транзакцию с отрицательной суммой.
        // Исключение намеренно не перехватываем, чтобы программа завершилась с ошибкой,
        // демонстрируя работу валидации.
        Transaction bad = new Transaction("Иван Петров", "Мария Смирнова", -100.0);

        // Этот код не выполнится из-за исключения выше:
        System.out.println(bad.describe());
    }
}