package ru.javarush.java.core.level20.task12;

public class Solution {
    // Универсальная процедура тестирования: принимает любой Player и любой Recorder
    public static void testDevice(Player p, Recorder r) {
        // Вызовы соответствующих возможностей
        p.play();
        r.record();
    }

    public static void main(String[] args) {
        // Создаём одно устройство
        MediaDevice device = new MediaDevice();

        // Передаём один и тот же объект сразу в обе роли: и Player, и Recorder
        testDevice(device, device);
    }
}