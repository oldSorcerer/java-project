package ru.javarush.java.core.level43.task04;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        // Создаем сотрудника и задаем зарплату 5000
        Employee original = new Employee("Иван Петров");
        original.setEmployeeSalary(5000);

        // Сериализуем объект в память (в байтовый массив)
        byte[] data;
        try (ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(byteOut)) {

            // Зарплата transient — не попадет в поток
            out.writeObject(original);
            out.flush();
            data = byteOut.toByteArray();
        } catch (Exception e) {
            // Для учебной задачи упрощаем обработку ошибок
            throw new RuntimeException(e);
        }

        // Десериализуем объект из памяти
        Employee restored;
        try (ByteArrayInputStream byteIn = new ByteArrayInputStream(data);
             ObjectInputStream in = new ObjectInputStream(byteIn)) {

            restored = (Employee) in.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Выводим имя и зарплату восстановленного сотрудника.
        // Ожидаемо salary == 1000 благодаря логике в readObject.
        System.out.println(restored.getEmployeeName() + " " + restored.getEmployeeSalary());
    }
}