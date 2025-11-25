package ru.javarush.java.core.level46.task10;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) {
        // Пути к файлам схемы и данных
        var schemaPath = Paths.get("club-member-schema.json");
        var dataPath = Paths.get("bad-member-data.json");

        // Читаем оба файла и парсим JSON


            // Загружаем схему (правила допуска)

        
            // Загружаем данные "нарушителя"


            // Проводим строгую валидацию данных по схеме


            // Не углубляемся в обработку всех ошибок, выводим краткое сообщение

    }
}