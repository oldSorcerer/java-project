package ru.javarush.java.core.level16.task17;

// Класс-демо с методом main
public class Solution {
    public static void main(String[] args) {
        // Создаём универсальную коробку без знания типа содержимого
        StorageBox box = new StorageBox();

        // Кладём внутрь строку
        box.put("Привет из прошлого!");

        // Извлекаем содержимое (тип Object) и выводим на экран
        Object content = box.retrieve();
        System.out.println(content);
    }
}

// Универсальная коробка: хранит любой объект без информации о его типе
class StorageBox {
    // Приватное поле для хранения содержимого

    // Помещение предмета в коробку


    // Извлечение предмета из коробки

}