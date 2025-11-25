package ru.javarush.java.core.level44.task05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем список, который будет ссылаться сам на себя
        ArrayList<Object> paradox = new ArrayList<>();
        paradox.add("cycle");          // Сначала добавляем обычную строку
        paradox.add(paradox);          // Затем добавляем сам список в качестве второго элемента

        // Сериализуем список в файл. try-with-resources автоматически закроет поток


        // Десериализуем список из файла — имитируем перезапуск программы


        // Проверяем, что воссоздана та же структура ссылок:
        // второй элемент списка является тем же самым объектом (==), что и сам список

    }
}