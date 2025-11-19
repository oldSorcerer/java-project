package ru.javarush.java.core.level27.task04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Создаем множество HashSet<String> для хранения технологий
        Set<String> set = new HashSet<>();

        // Добавляем названия технологий
        set.add("java");
        set.add("python");
        set.add("c++");
        set.add("javascript");

        // Удаляем элементы, содержащие символ '+', используя итератор
//        set.removeIf(s -> s.contains("+"));
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (string.contains("+")) {
                iterator.remove();
            }
        }

        // Выводим оставшиеся элементы множества, каждый на новой строке (порядок не гарантируется)
//        set.forEach(System.out::println);
        for (String string : set) {
            System.out.println(string);
        }
    }
}