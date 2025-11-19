package ru.javarush.java.core.level27.task05;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        // Создаем очередь задач на основе LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Добавляем идентификаторы задач в указанном порядке
        queue.add(5);
        queue.add(15);
        queue.add(25);

        // Получаем первый элемент без удаления из очереди (peek не изменяет очередь)
        Integer integer = queue.peek();

        // Выводим идентификатор следующей задачи
        System.out.println(integer);

        // Выводим текущий размер очереди
        System.out.println(queue.size());
    }
}