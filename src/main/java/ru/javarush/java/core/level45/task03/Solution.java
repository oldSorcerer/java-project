package ru.javarush.java.core.level45.task03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        // 1) Создаем список, способный хранить любые объекты
        List<Object> mysteryBoxContents = new ArrayList<>();
        mysteryBoxContents.add("Hello Java"); // строка
        mysteryBoxContents.add(123);          // целое число

        // 2) Сериализуем список в файл


        // 3) Десериализуем список обратно в List<Object>


        // 4) Выводим фактический класс каждого элемента с использованием getClass()


        // 5) Пытаемся привести весь список к List<String>.
        // Из-за стирания типов ошибка возникнет не в момент каста списка,
        // а в момент чтения элементов как String (внутренний runtime-каст).

    }
}