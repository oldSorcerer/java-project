package ru.javarush.java.core.level53.task08;

import java.util.concurrent.atomic.AtomicReference;

public class Solution {
    public static void main(String[] args) {
        // Создаем изначального лидера гильдии — объект Alice.
        // Важно сохранить ссылку на него в переменной alice, чтобы использовать в compareAndSet.
        GuildMember alice = new GuildMember("Alice");

        // AtomicReference хранит текущего лидера и обеспечивает атомарные операции обновления.


        // Новый претендент на лидерство — Bob.
        GuildMember bob = new GuildMember("Bob");

        // Пытаемся заменить лидера с Alice на Bob.
        // compareAndSet выполнит замену только если текущая ссылка внутри AtomicReference равна (==) alice.
        // Это гарантирует "безопасную" смену лидера без гонок.


        // Выводим имя текущего лидера после попытки смены.
        // Если compareAndSet сработал — увидим "Bob", иначе останется "Alice".

    }
}

// Простой класс участника гильдии с одним полем name.
class GuildMember {
    final String name;

    GuildMember(String name) {
        this.name = name;
    }
}