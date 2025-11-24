package ru.javarush.java.core.level43.task06;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем исходную точку с координатами X=10, Y=20
        Point original = new Point(10, 20);

        // "Сохраняем" объект в байтовый массив (сериализация)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(original);
        out.close();
        byte[] data = baos.toByteArray();

        // "Загружаем" объект из байтового массива (десериализация)
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data));
        Point restored = (Point) in.readObject();
        in.close();

        // Выводим значения полей после десериализации
        // Из-за намеренно нарушенного порядка записи/чтения они поменяются местами: станут X=20, Y=10
        System.out.println(restored.pointX);
        System.out.println(restored.pointY);
    }
}