package ru.javarush.java.core.level47.task04;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Пусть путь к XML можно передать аргументом, а по умолчанию читаем файл "users.xml" из текущей папки
        String filePath = (args.length > 0) ? args[0] : "users.xml";

        // Создаем фабрику DOM-парсера и сам парсер

        // Разбираем XML-файл в объект Document (DOM-дерево)


        // Нормализуем документ (склеивает текстовые узлы, убирает лишние пробелы между тегами и т.п.)


        // Находим все элементы <user> в документе


        // Проходим по всем найденным <user>


            // Проверяем, что узел — это именно элемент (а не, например, текстовый узел)


                // Извлекаем значения атрибутов id и name


                // Выводим информацию в требуемом формате



    }
}