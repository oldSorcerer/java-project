package ru.javarush.java.core.level25.task06;

public class EmailClient {

    // Нестатический внутренний класс: письмо существует только в контексте EmailClient


    // Метод, который "составляет" письмо и возвращает новый объект Email
    public Email composeEmail(String messageContent) {
        // Создаем письмо, привязанное к текущему экземпляру EmailClient

    }

    public static void main(String[] args) {
        // Создаем почтовый клиент


        // Составляем тестовое письмо через метод composeEmail


        // Проверяем, что письмо создано: выводим его содержимое

    }
}