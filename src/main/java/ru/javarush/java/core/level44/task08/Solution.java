package ru.javarush.java.core.level44.task08;

import java.io.*;

// Класс Item с именем и поддержкой сериализации
class Item implements Serializable {
    public String name; // простое публичное поле для наглядности
}

// Обертка над Item, тоже сериализуемая
class Wrapper implements Serializable {
    public Item wrappedItem;
}

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем один-единственный уникальный Item
        Item uniqueItem = new Item();
        uniqueItem.name = "Magic Amulet";

        // Создаем два Wrapper, оба ссылаются на один и тот же uniqueItem
        Wrapper firstWrapper = new Wrapper();
        firstWrapper.wrappedItem = uniqueItem;

        Wrapper secondWrapper = new Wrapper();
        secondWrapper.wrappedItem = uniqueItem;

        // Сериализуем каждый Wrapper в свой файл (разные потоки, разные файлы)
        // Важно: при раздельной сериализации графы объектов не "делят" идентичность между файлами


        // Независимо десериализуем каждый Wrapper из своего файла


        // Сравниваем ссылки на вложенные Item: ожидается false
        // (== сравнивает именно ссылки, а после раздельной десериализации создаются независимые копии)


        // Для наглядности выводим имена: данные совпадают, ссылки — нет

    }
}