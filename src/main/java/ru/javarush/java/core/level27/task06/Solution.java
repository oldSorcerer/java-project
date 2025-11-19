package ru.javarush.java.core.level27.task06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        // Очередь печати на базе ArrayDeque (FIFO)
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Кот");
        queue.add("Пёс");
        queue.add("Мышь");

        // Стек истории действий на базе ArrayDeque (LIFO)
        Deque<Character> stack = new ArrayDeque<>();

        // Используем push для добавления на вершину стека
        stack.push('X');
        stack.push('Y');
        stack.push('Z');

        // Вывод очереди: сначала заголовок, затем извлекаем (poll) элементы в порядке FIFO
        System.out.println("Очередь:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // Вывод стека: сначала заголовок, затем снимаем (pop) элементы в порядке LIFO
        System.out.println("Стек:");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}