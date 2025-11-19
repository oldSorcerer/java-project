package ru.javarush.java.core.level24.task06;

// Главный класс с методом main
public class Solution {
    public static void main(String[] args) {
        try {
            // Симулируем установку слишком короткого пароля

        } catch (... e) {
            // Перехватываем и выводим сообщение из исключения
            System.out.println(e.getMessage());
        }
    }
}

// Собственное проверяемое исключение, наследуется от Exception
class WeakPasswordException extends Exception {
    // Конструктор, принимающий сообщение и передающий его в суперкласс
    public WeakPasswordException(String message) {
        super(message);
    }
}