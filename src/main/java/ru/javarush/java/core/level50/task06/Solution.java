package ru.javarush.java.core.level50.task06;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект слушателя
        SimpleMageListener listener = new SimpleMageListener();

        // Создаем магический импульс с сообщением
        MagicalPulseEvent pulse = new MagicalPulseEvent("Сигнал от древнего артефакта");

        // Передаем импульс слушателю для обработки
        listener.onMagicalPulse(pulse);
    }
}