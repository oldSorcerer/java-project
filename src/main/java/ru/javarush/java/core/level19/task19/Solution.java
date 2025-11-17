package ru.javarush.java.core.level19.task19;

import java.util.HashMap;
import java.util.Map;

/**
 * Демонстрация многослойной архитектуры с внедрением зависимостей через конструкторы.
 * Слои: UserInterface -> TaskService -> TaskRepository (реализация InMemoryTaskRepository).
 */
public class Solution {
    public static void main(String[] args) {
        // Создаем реализацию репозитория (хранилище в памяти)
        TaskRepository repository = new InMemoryTaskRepository(); // Можно легко заменить на другую реализацию

        // Внедряем репозиторий в сервис (через конструктор)
        TaskService service = new TaskService(repository);

        // Внедряем сервис в пользовательский интерфейс (через конструктор)
        UserInterface ui = new UserInterface(service);

        // Демонстрация работы: добавляем и тут же помечаем задачу выполненной
        ui.addAndCompleteTask("Выучить внедрение зависимостей через конструктор");
    }
}