package ru.javarush.java.core.level29.task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        // Создаём два независимых объекта с одинаковыми значениями полей
        Employee first = new Employee("Алиса", 123);
        Employee second = new Employee("Алиса", 123);

        // HashMap, где ключом выступает Employee, а значением — роль
        Map<Employee, String> roles = new HashMap<>();

        // Кладём в карту пару (ключ — первый объект, значение — "Работник")
        roles.put(first, "Работник");

        // Пытаемся получить значение по "логически равному" ключу (второй объект)
        // Это сработает только при корректных equals и hashCode
        String role = roles.get(second);

        // Ожидаемый вывод: "Работник"
        System.out.println(role);
    }
}