package ru.javarush.java.core.level44.task03;

import java.io.*;

// Класс узла двусвязного кольца.
// Реализует Serializable, чтобы можно было сохранять/восстанавливать граф объектов с циклами.
class Node implements Serializable {
    String value; // значение узла (например, название станции)
    Node next;    // ссылка на следующий узел
    Node prev;    // ссылка на предыдущий узел

    Node(String value) {
        this.value = value;
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        // 1) Создаем три уникальных узла
        Node firstNodeInCycle = new Node("Station A");
        Node middleNode = new Node("Station B");
        Node lastNodeInCycle = new Node("Station C");

        // 2) Связываем их в замкнутый двусвязный цикл
        // Прямые ссылки
        firstNodeInCycle.next = middleNode;
        middleNode.next = lastNodeInCycle;
        lastNodeInCycle.next = firstNodeInCycle; // замыкаем кольцо по next

        // Обратные ссылки


        // 3) Сериализуем первый узел (вся структура сохранится, т.к. сериализуется граф объектов)

            // Стандартная бинарная сериализация корректно обрабатывает циклические ссылки.



        // 4) Десериализуем обратно


        // 5) Проверяем целостность структуры: идем по next и печатаем значения трех узлов

    }
}