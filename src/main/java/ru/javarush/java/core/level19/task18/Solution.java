package ru.javarush.java.core.level19.task18;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаём хранилище и сервис, который опирается только на абстракцию TaskRepository
        TaskRepository repository = new InMemoryTaskRepository();
        TaskService service = new TaskService(repository);

        // Демонстрация: создаём новую задачу
        Task task = new Task("Написать демо для TaskService");

        // Добавляем задачу через сервис (делегирование в репозиторий)
        service.addTask(task);

        // Смотрим состояние до выполнения
        System.out.println("До выполнения:  " + task);

        // Выполняем задачу по названию через сервис
        service.completeTask("Написать демо для TaskService");

        // Смотрим состояние после выполнения
        System.out.println("После выполнения: " + task);
    }
}