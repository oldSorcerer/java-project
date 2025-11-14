package ru.javarush.java.core.level16.task07;

public class ArtifactChain {
    // Ссылка на начало цепочки (голову списка)
    private Link head;

    // Приватный статический вложенный класс — отдельное звено цепочки.
    // static: звено не хранит неявную ссылку на внешний объект ArtifactChain.
    private static class Link {
        private final int value;
        private final Link next;

        public Link(int value, Link next) {
            this.value = value;
            this.next = next;
        }
    }

    // Добавляем новый артефакт в начало цепи (в голову списка)
    public void addArtifact(int artifactValue) {
        head = new Link(artifactValue, head);
    }

    // Проходим по всей цепи и печатаем значения каждого звена
    public void displayChain() {
        for (Link current = head; current != null; current = current.next) {
            System.out.println(current.value);
        }
    }

    public static void main(String[] args) {
        // Создаем цепочку артефактов
        ArtifactChain chain = new ArtifactChain();

        // Добавляем артефакты в указанном порядке
        chain.addArtifact(5);
        chain.addArtifact(10);
        chain.addArtifact(15);

        // Выводим всю цепочку (ожидается порядок: 15, 10, 5 — так как добавляем в начало)
        chain.displayChain();
    }
}