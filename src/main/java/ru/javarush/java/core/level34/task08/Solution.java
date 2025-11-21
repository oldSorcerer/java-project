package ru.javarush.java.core.level34.task08;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем изменяемый внутренний список строк — наш плейлист
        List<String> myFirstPlaylist = new ArrayList<>();

        // Создаем внешний неизменяемый список с единственным элементом — ссылкой на myFirstPlaylist


        // Демонстрация невозможности изменения внешнего списка:
        // попытка добавить новый плейлист приводит к UnsupportedOperationException


        // Меняем содержимое внутреннего списка после того, как внешний уже стал неизменяемым


        // Выводим оба списка: видно, что внутренний изменился, а внешний по-прежнему содержит один плейлист
        System.out.println("allPlaylists = " + allPlaylists);
        System.out.println("myFirstPlaylist = " + myFirstPlaylist);
    }
}