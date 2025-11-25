package ru.javarush.java.core.level47.task08;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class Solution {
    public static void main(String[] args) {
        try {
            // Создаем контекст JAXB для класса Book


            // Создаем Unmarshaller для преобразования XML -> объект Java


            // Читаем XML из файла "book.xml" в текущей директории проекта


            // Выполняем десериализацию XML в объект Book


            // Выводим подтверждение корректной загрузки данных

        } catch (Exception e) {
            // Простая обработка возможных ошибок чтения/десериализации
            System.out.println("Ошибка при загрузке книги: " + e.getMessage());
        }
    }
}