package ru.javarush.java.core.level44.task09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        // 1) Создаем список строк с названиями фруктов
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");

        // 2) Сериализуем список в файл "fruits.ser"
        // try-with-resources автоматически закроет поток после записи


        // 3) Десериализуем объект из файла "fruits.ser"


        // 4) Неправильное приведение типа:
        // Из-за стирания типов (type erasure) компилятор не видит реальный параметр типа,
        // поэтому приведение к ArrayList<Integer> компилируется, но это логическая ошибка.


        // 5) Попытка получить первый элемент как Integer.
        // Фактически внутри лежит строка "apple", поэтому на этой строке возникнет
        // java.lang.ClassCastException во время выполнения.


        // Этот вывод не будет достигнут из-за исключения выше.

    }
}