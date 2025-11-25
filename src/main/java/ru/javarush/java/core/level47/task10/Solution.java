package ru.javarush.java.core.level47.task10;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Заполняем календарь несколькими праздничными датами
        Calendar calendar = new Calendar();
        calendar.addHoliday(LocalDate.of(2025, 1, 1));   // 01.01.2025
        calendar.addHoliday(LocalDate.of(2025, 5, 9));   // 09.05.2025
        calendar.addHoliday(LocalDate.of(2025, 12, 31)); // 31.12.2025

        // Готовим JAXB к сериализации класса Calendar


        // Включаем форматированный вывод для читаемости


        // Сериализация в стандартный вывод (консоль)
        // В XML будет контейнер <holidays> и элементы <date> с датами в формате dd.MM.yyyy

    }
}