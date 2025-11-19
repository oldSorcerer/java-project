package ru.javarush.java.core.level24.task05;

public class Solution {
    public static void main(String[] args) {
        // Небольшая демонстрация работы "стража ворот"

        try {
            // Пробуем слишком маленький счёт — ожидаем исключение
            checkPlayerScore(5);
            System.out.println("Этот текст не будет выведен");
        } catch (ScoreTooLowException e) {
            System.out.println(e.getMessage()); // Выведет: "Счёт игрока слишком низкий!"
        }

        try {
            // Пробуем корректный счёт — исключений быть не должно
            checkPlayerScore(12);
            System.out.println("Счёт 12 принят");
        } catch (ScoreTooLowException e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод-страж: проверяет счёт и бросает собственное исключение при некорректном значении
    public static void checkPlayerScore(int score) throws ScoreTooLowException {

            // Сообщение должно быть строго таким, как в требованиях

        // Если счёт 10 или больше — метод завершается без исключений
    }
}