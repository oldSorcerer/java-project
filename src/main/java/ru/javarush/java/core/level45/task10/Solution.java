package ru.javarush.java.core.level45.task10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем список инвентаря игрока на 10 000 предметов
        List<GameItem> playerInventory = new ArrayList<>(10_000);

        // Заполняем инвентарь уникальными предметами (уникальные itemId и itemName)
        for (int i = 1; i <= 10_000; i++) {
            playerInventory.add(new GameItem(i, "Item-" + i));
        }

        // Сериализуем список в файл "items.bin" с использованием буферизации для повышения производительности

        
    }
}

// Класс предмета инвентаря. Должен быть сериализуемым.
class GameItem implements Serializable {
    // Поля по условию: уникальный идентификатор и имя предмета
    int itemId;
    String itemName;

    GameItem(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }
}