package ru.javarush.java.core.level24.task05;

// Собственное (проверяемое) исключение, сигнализирующее о слишком низком счёте игрока
public class ScoreTooLowException extends Exception {
    // Конструктор принимает сообщение об ошибке и передаёт его базовому классу Exception
    public ScoreTooLowException(String message) {
        super(message);
    }
}