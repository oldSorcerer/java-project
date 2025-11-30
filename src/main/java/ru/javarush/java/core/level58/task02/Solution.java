package ru.javarush.java.core.level58.task02;

import java.util.concurrent.StructuredTaskScope;

public class Solution {

    public static void main(String[] args) throws Exception {
        // Создаем область структурной конкуренции. Передаем фабрику виртуальных потоков,
        // чтобы каждая подзадача запускалась в отдельном виртуальном потоке.
        try (var scope = new StructuredTaskScope.ShutdownOnSuccess<String>()) {
            // Запускаем три "запроса" параллельно


            // Ждем первый успешный результат


            // StructuredTaskScope.ShutdownOnSuccess автоматически прерывает остальные подзадачи,
            // как только одна завершилась успешно — это выполняет требование "Отмена оставшихся задач".

        }
    }

    // Имитируем обращение к удаленному серверу
    // Если подзадачу отменят, во время sleep прилетит InterruptedException — это быстрый и корректный выход.
    private static String requestFromServer(String serverName, int delayMs) throws InterruptedException {
        Thread.sleep(delayMs); // имитация сетевой задержки/обработки
        return serverName;     // уникальный ответ сервера
    }
}