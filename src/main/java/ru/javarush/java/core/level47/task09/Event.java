package ru.javarush.java.core.level47.task09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.LocalDate;


public class Event {
    // Название события будет элементом внутри <Event> (по умолчанию для поля)
    public String title;

    // Дата события — атрибут тега <Event>, форматируется через адаптер

    public LocalDate date;

    // Пустой конструктор обязателен для JAXB
    public Event() { }

    public Event(String title, LocalDate date) {
        this.title = title;
        this.date = date;
    }
}