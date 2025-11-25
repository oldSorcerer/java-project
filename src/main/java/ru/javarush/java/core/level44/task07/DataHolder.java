package ru.javarush.java.core.level44.task07;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Хранилище ссылки на общий документ.
 * Делается public и Serializable по требованиям задачи.
 */
public class DataHolder implements Serializable {
    // Поле с именем data типа ArrayList<String> — общий документ
    public ArrayList<String> data;
}