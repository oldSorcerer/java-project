package ru.javarush.java.core.level25.task10;

// Базовый класс для запуска примера
public class Solution {
    public static void main(String[] args) {
        UserAccessService service = new UserAccessService();

        try {
            // Имитация неудачной попытки входа: неверный пароль
            service.authenticateUser("agent007", "wrong");

            // Если исключения не было — доступ разрешен
            System.out.println("Доступ разрешён.");
        } catch (SecurityBreachException e) {
            // Перехватываем по базовому типу — демонстрация полиморфизма
            System.out.println("Произошёл сбой безопасности: " + e.getMessage());
        }
    }
}