package ru.javarush.java.core.level20.task07;

public class Solution {
    public static void main(String[] args) {
        // Небольшая демонстрация: устройство умеет и печатать, и сканировать
        MultiFunctionDevice device = new MultiFunctionDevice();
        device.print();
        device.scan();
    }
}