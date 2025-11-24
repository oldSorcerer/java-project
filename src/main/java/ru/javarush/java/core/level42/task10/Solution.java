package ru.javarush.java.core.level42.task10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаём карту оценок. Используем LinkedHashMap, чтобы сохранить порядок добавления элементов.
        Map<String, Integer> studentGrades = new LinkedHashMap<>();
        studentGrades.put("Анна", 90);
        studentGrades.put("Борис", 85);
        studentGrades.put("Вика", 92);

        // Сериализуем карту в файл "scores.ser" стандартными средствами Java


        // Десериализуем карту из файла в recoveredGrades


        // Выводим пары "Имя: Балл", каждая на новой строке


    }
}