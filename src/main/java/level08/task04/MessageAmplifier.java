package ru.javarush.java.core.level08.task04;

public class MessageAmplifier {

    // Публичный статический метод, который повторяет строку и выводит результат
    public static void amplifyAndDisplay(String messageText, int numberOfRepeats) {
        // Используем обычную строку и оператор +
        String repeat = messageText.repeat(numberOfRepeats);

        // Выводим итоговую "усиленную" строку
        System.out.println(repeat);
    }

    public static void main(String[] args) {
        // Демонстрация работы: усиливаем сообщение "Ура!" четыре раза
        amplifyAndDisplay("Ура!", 4);
    }
}