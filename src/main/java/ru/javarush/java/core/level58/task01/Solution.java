package ru.javarush.java.core.level58.task01;

import java.util.concurrent.StructuredTaskScope;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Используем structured concurrency: общий "зонтик" для параллельных задач.
        try ( ... ) {

            // Запускаем две независимые задачи (отделы)


            // Дожидаемся завершения всех задач в рамках scope (или отмены при ошибке)


            // Если какая-то задача завершилась с ошибкой — пробросить исключение.


            // Обе задачи успешны — объединяем результаты через пробел


            // Выводим итоговое сообщение на "центральный монитор"

        }
    }
}