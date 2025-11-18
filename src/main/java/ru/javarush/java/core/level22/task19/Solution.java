package ru.javarush.java.core.level22.task19;

public class Solution {
    public static void main(String[] args) {
        // Создаем документ с произвольным текстовым содержимым
        Printable doc = new Document("Привет из record-класса!");

        // Демонстрация работы: печать содержимого документа
        doc.print();
    }
}