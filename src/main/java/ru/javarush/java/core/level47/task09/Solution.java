package ru.javarush.java.core.level47.task09;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем пример события
        Event event = new Event("Java Meetup", LocalDate.of(2024, 6, 5));

        // Инициализируем JAXB-контекст по классу Event


        // Настраиваем маршаллер (сериализацию в XML)


        // Сериализуем в XML и печатаем в консоль

    }
}