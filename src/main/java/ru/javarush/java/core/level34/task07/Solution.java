package ru.javarush.java.core.level34.task07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // 1) Изменяемый инвентарь питомцев
        List<String> petInventory = new ArrayList<>();
        petInventory.add("кошка");
        petInventory.add("собака");

        // 2) "Живое" представление: отражает изменения исходного списка,
        //    но напрямую изменить его нельзя (попытка = UnsupportedOperationException)


        // 3) "Снимок" текущего состояния: независимая неизменяемая копия на момент создания


        // 4) В исходный инвентарь добавляется новый житель


        // 5) Выводим содержимое представлений
        //    livePetView покажет изменения, snapshotPetList останется прежним


        // 6) Демонстрация запрета изменений через представления:
        //    обе попытки приведут к UnsupportedOperationException

    }
}