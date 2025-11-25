package ru.javarush.java.core.level47.task05;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем фабрику StAX-парсеров


        // Открываем файл "example.xml" из текущей директории

            // Создаем XMLStreamReader на основе входного потока


            // Если объект успешно создан — сообщаем об этом


            // Закрываем ридер (поток закроется автоматически благодаря try-with-resources)


    }
}