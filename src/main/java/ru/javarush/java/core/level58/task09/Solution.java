package ru.javarush.java.core.level58.task09;

public class Solution {
    // Volatile-ссылка для безопасной публикации конфигурации между потоками


    public static void main(String[] args) throws InterruptedException {
        // Поток инициализации: создает полностью готовый объект и публикует его через volatile
        Thread initThread = new Thread(() -> {
            HomeConfiguration cfg = new HomeConfiguration(); // securityCode = 123 при создании
            // Публикация через volatile гарантирует видимость полностью инициализированного объекта

        });

        // Поток "панели управления": ждёт появления конфигурации и выводит securityCode
        Thread panelThread = new Thread(() -> {
            // Активное ожидание появления опубликованной конфигурации

                // Ничего не делаем — просто повторяем проверку

            // После чтения volatile-ссылки видны все записи конструктора


        });

        panelThread.start();
        initThread.start();

        // Ждём завершения потоков, чтобы программа корректно завершилась
        initThread.join();
        panelThread.join();
    }
}

// Класс конфигурации "Умного дома"
class HomeConfiguration {
    int securityCode;

    HomeConfiguration() {
        // Поле инициализируется при создании объекта
        this.securityCode = 123;
    }
}