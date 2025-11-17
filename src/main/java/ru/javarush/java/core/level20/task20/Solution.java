package ru.javarush.java.core.level20.task20;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем издателя
        NewsPublisher publisher = new NewsPublisher();

        // Создаем двух подписчиков с разными именами
        Person andrey = new Person("Андрей");
        Person boris = new Person("Борис");

        // Подписываем их на новости
        publisher.addSubscriber(andrey);
        publisher.addSubscriber(boris);

        // Оповещаем всех подписчиков о новой новости
        publisher.notifySubscribers("Обновление курса Java!");
    }
}