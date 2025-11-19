package ru.javarush.java.core.level27.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    // Метод принимает список-приёмник с типом ? super String,
    // что позволяет безопасно добавлять в него строки,
    // даже если фактический тип списка более общий (например, Object).
    public static void addStrings(List<? super String> list, List<String> value) {
        // Добавляем все сообщения разом — согласно требованию используем addAll
        list.addAll(value);
    }

    public static void main(String[] args) {
        // Универсальный журнал событий: может хранить любые объекты
        ArrayList<Object> eventLog = new ArrayList<>();

        // Тестовые строковые сообщения
        List<String> messages = Arrays.asList(
                "Система запущена",
                "Ошибка базы данных",
                "Операция завершена"
        );

        // Добавляем строки в универсальный журнал через метод с wildcard ? super String
        addStrings(eventLog, messages);

        // Проверяем результат: выводим содержимое журнала
        System.out.println(eventLog);
    }
}