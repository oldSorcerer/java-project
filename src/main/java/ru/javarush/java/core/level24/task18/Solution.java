package ru.javarush.java.core.level24.task18;

// Класс ресурса, который нужно корректно закрывать
class MagicArtifact {

    @Override
    public void close() {
        // Сообщение, подтверждающее автоматическое отключение артефакта
        System.out.println("Магический артефакт безопасно отключён");
    }
}

public class Solution {
    public static void main(String[] args) {
        // try-with-resources гарантирует автоматический вызов close()
        // даже если внутри блока произойдет исключение

            System.out.println("Идёт работа с магическим артефактом");
            // Здесь могла бы быть любая логика работы с артефактом

        // К этому моменту артефакт уже закрыт, сообщение выведено
    }
}