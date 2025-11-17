package ru.javarush.java.core.level20.task18;

public class Solution {
    public static void main(String[] args) {
        // Внедряем реализацию EmailSender в Notification
        MessageSender emailSender = new EmailSender();
        Notification notification = new Notification(emailSender);

        // Тестируем отправку уведомления
        notification.notifyUser("Привет!"); // Ожидаемый вывод: "Email отправлен: Привет!"
    }
}