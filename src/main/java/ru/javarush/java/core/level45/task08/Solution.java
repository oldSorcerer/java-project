package ru.javarush.java.core.level45.task08;

import java.io.*;

// Демонстрация миграции сериализованных данных между версиями класса.
// V1: userName + userAgeInt (int), serialVersionUID = 200L
// V2: userName + userAgeString (String), serialVersionUID = 200L
public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = "userV1.dat";

        // 1) Сериализуем объект старой версии (имитация "старой базы")
        UserV1 oldUser = new UserV1("Alice", 30);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(oldUser);
        }

        // 2) Десериализуем файл как UserV2 с миграцией полей
        //    Используем специальный ObjectInputStream, который подменяет класс UserV1 на UserV2
        UserV2 migrated;
        try (ObjectInputStream in = new VersionMappingObjectInputStream(new FileInputStream(fileName))) {
            migrated = (UserV2) in.readObject(); // readObject внутри UserV2 выполнит миграцию возраста
        }

        // 3) Вывод результата
        System.out.println("Имя пользователя: " + migrated.userName + ", Возраст: " + migrated.userAgeString);
    }
}