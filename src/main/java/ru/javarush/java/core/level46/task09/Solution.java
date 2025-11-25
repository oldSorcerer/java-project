package ru.javarush.java.core.level46.task09;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) {
        // Пути к файлам. Ожидаем запуск из корня проекта (папки myproject).
        Path schemaPath = Path.of("user-profile-schema.json");
        Path dataPath = Path.of("new-user-profile.json");

        try {
            // Читаем содержимое файлов целиком строками (UTF-8 по умолчанию для Files.readString)
            String schemaContent = Files.readString(schemaPath);
            String dataContent = Files.readString(dataPath);

            // Парсим строки в объекты JSONObject


            // Создаем объект схемы (валидатор)
            // SchemaLoader понимает JSON-объект со структурой JSON Schema


            // Пытаемся провалидировать данные. В случае ошибок будет брошено ValidationException


            // Если исключения не было — данные валидны
            System.out.println("Досье пользователя валидно! Данные в порядке!");
        } catch (ValidationException ve) {
            // В учебной задаче достаточно кратко сообщить об ошибке
            System.out.println("Досье пользователя НЕ валидно: " + ve.getMessage());
        } catch (IOException ioe) {
            // Если не удалось прочитать файлы — сообщаем и завершаемся
            System.out.println("Ошибка чтения файлов: " + ioe.getMessage());
        }
    }
}