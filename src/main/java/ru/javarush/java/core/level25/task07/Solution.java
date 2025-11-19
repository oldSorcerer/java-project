package ru.javarush.java.core.level25.task07;

public class Solution {
    // Универсальная «взлётная полоса»: принимает любой объект, который умеет летать
    public static void launchIntoSky(CanFly flyingObject) {
        // Полиморфный вызов: конкретный soar() определяется у переданного объекта
        flyingObject.soar();
    }

    public static void main(String[] args) {
        // Создаём летающие объекты разных типов
        Aircraft aircraft = new Aircraft();
        Eagle eagle = new Eagle();

        // Запускаем их в небо через универсальную взлётную полосу
        launchIntoSky(aircraft);
        launchIntoSky(eagle);
    }
}