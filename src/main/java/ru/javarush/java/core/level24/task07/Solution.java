package ru.javarush.java.core.level24.task07;

public class Solution {
    public static void main(String[] args) {
        int userAge = 14;
        int requiredAge = 16;

        try {
            // Пытаемся пройти возрастной контроль
            checkRideAge(userAge, requiredAge);
            System.out.println("Добро пожаловать на аттракцион!");
        } catch (... e) {
            // Показываем осмысленное сообщение из нашего исключения
            System.out.println("Отказ: " + e.getMessage());
        }
    }

    // Метод, который проверяет возраст и может "выбросить" наше исключение
    static void checkRideAge(int age, int minAge) throws ... {
        if (age < minAge) {
            // Демонстрация выбрасывания исключения с осмысленным сообщением
            throw new ...(
                "Вам должно быть не менее " + minAge + " лет для этого аттракциона (сейчас " + age + ")."
            );
        }
    }
}