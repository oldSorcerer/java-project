package ru.javarush.java.core.level64.task03;

public class Solution {
    /*
     * Команда запуска программы с флагом для вывода деталей сборки мусора:
     *   javac Solution.java && java -XX:+PrintGCDetails Solution
     *
     * Пример строки из лога JVM, по которой видно, что используется G1GC:
     *   0.123: [GC pause (G1 Evacuation Pause) (young) 5M->1M(10M) 0.0012345 secs]
     * В этом сообщении фраза "G1 Evacuation Pause" однозначно указывает на сборщик G1GC.
     */
    public static void main(String[] args) {
        // Выводим приветственное сообщение детективу сборщиков мусора
        System.out.println("Hello, GC Detective!");
    }
}