package ru.javarush.java.core.level42.task04;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        // 1) Создаем нового "гражданина" с произвольными данными
        Person newCitizen = new Person("Alice Johnson", 30);

        // 2) "Замораживаем" (сериализуем) объект в файл person.ser
        // try-with-resources автоматически закроет потоки после использования


        // 3) "Размораживаем" (десериализуем) объект из файла person.ser


        // 4) Проверяем, что данные восстановились корректно — выводим поля

    }
}

// Класс Person помечаем как сериализуемый с помощью интерфейса Serializable
// Так объекты можно "замораживать" (писать в поток) и "размораживать" (читать из потока)
class Person  {
    // Поля согласно требованию
    public String citizenName;
    public int citizenAge;

    public Person(String citizenName, int citizenAge) {
        this.citizenName = citizenName;
        this.citizenAge = citizenAge;
    }
}