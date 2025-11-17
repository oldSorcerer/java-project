package ru.javarush.java.core.level19.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаём конкретную реализацию репозитория (инфраструктурный слой)
        TaskRepository repository = new InMemoryTaskRepository();

        // Добавляем задачи разных типов (минимум по одному каждого вида)
        repository.add(new WorkTask("Подготовить отчёт", "пятница 18:00"));
        repository.add(new HomeTask("Помыть посуду", "кухня"));

        // Сервис работает только с интерфейсом репозитория и абстрактным типом Task
        TaskService service = new TaskService(repository);

        // 1) Получение и вывод информации о задачах
        service.printAllTasksInfo();

        System.out.println(); // Пустая строка для наглядности вывода

        // 2) Демонстрация выполнения задач
        service.completeAllTasks();
    }
}