package ru.javarush.java.core.level47.task07;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем тестовый объект
        Book book = new Book("Java", "Smith");

        // Создаем JAXB-контекст только для класса Book


        // Подготавливаем маршалер (преобразователь объекта в XML)


        // Выводим XML-представление в консоль

    }
}