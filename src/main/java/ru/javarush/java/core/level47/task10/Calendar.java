package ru.javarush.java.core.level47.task10;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Calendar {

    // Создаём контейнер <holidays> и внутри него элементы <date> для каждой даты

    private List<LocalDate> holidays = new ArrayList<>();

    // Пустой конструктор обязателен для JAXB
    public Calendar() {
    }

    public List<LocalDate> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<LocalDate> holidays) {
        this.holidays = holidays;
    }

    // Удобный метод для добавления праздничной даты
    public void addHoliday(LocalDate date) {
        holidays.add(date);
    }
}