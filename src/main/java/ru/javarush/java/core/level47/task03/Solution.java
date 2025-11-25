package ru.javarush.java.core.level47.task03;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем фабрику и билдер DOM (стандартный способ парсить XML в память)


        // Открываем и парсим XML-файл library_catalog.xml


        // Нормализация приводит документ к каноничному виду (убирает лишние текстовые узлы и т.п.)


        // Получаем имя корневого элемента (главного узла)


        // Выводим имя корневого элемента на экран

    }
}