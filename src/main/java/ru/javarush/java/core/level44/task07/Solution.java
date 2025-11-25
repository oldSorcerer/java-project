package ru.javarush.java.core.level44.task07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        // 1) Создаем один-единственный общий список — общий "документ"
        ArrayList<String> sharedDataList = new ArrayList<>();

        // 2) Создаем два редактора, которые ССЫЛАЮТСЯ НА ОДИН И ТОТ ЖЕ список
        DataHolder firstEditor = new DataHolder();
        DataHolder secondEditor = new DataHolder();
        firstEditor.data = sharedDataList;
        secondEditor.data = sharedDataList;

        // 3) Сериализуем всю систему (оба объекта) в виде МАССИВА в один файл.
        // Важно: записываем единый граф объектов — это гарантирует сохранение идентичности ссылок.


        // 4) Десериализуем массив обратно


        // 5) Добавляем запись в общий список ТОЛЬКО через один из восстановленных объектов
        

        // 6) Выводим содержимое списка через оба восстановленных объекта.
        // Должно быть одинаковым, что подтверждает, что список остался общим.


        // Наглядная проверка идентичности ссылки (необязательная, но полезная):

    }
}