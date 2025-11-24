package ru.javarush.java.core.level22.task19;

public record Document(String text) implements Printable {

    @Override
    public void print() {
        System.out.println( "Документ: " + text);
    }
}
