package ru.javarush.java.core.level44.task06;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Класс узла сети: имя и список соседей.
// Реализует Serializable, чтобы можно было сохранять/загружать граф целиком.
class Node implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    List<Node> neighbors;

    Node(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем три узла с уникальными именами
        Node node1 = new Node("node1");
        Node node2 = new Node("node2");
        Node node3 = new Node("node3");

        // Формируем замкнутый цикл: node1 -> node2 -> node3 -> node1
        node1.neighbors.add(node2);
        node2.neighbors.add(node3);
        node3.neighbors.add(node1);

        // Сериализуем node1 в файл. ObjectOutputStream корректно обрабатывает циклы в графах.


        // Десериализуем обратно: получаем корень восстановленного графа


        // Идем по соседям три раза: должны вернуться к исходному узлу node1


        // Выводим результат проверки идентичности (должно быть true)
        
    }
}