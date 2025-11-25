package ru.javarush.java.core.level45.task01;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем Scanner для имитации ввода с клавиатуры
        Scanner console = new Scanner(System.in);

        // Заполняем объект Session: логин сохраняем, Scanner помечен transient
        Session session = new Session("PlayerOne", console);

        // Имя файла для сохранения
        String fileName = "session.bin";

        // Сериализация объекта Session в файл
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(session);
        }

        // Десериализация объекта Session из того же файла
        Session loaded;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            loaded = (Session) in.readObject();
        }

        // Проверяем восстановление: userLogin должен быть сохранен
        System.out.println(loaded.userLogin);

        // Проверяем transient-поле: после десериализации должно быть null
        System.out.println(loaded.inputScanner == null);
    }
}