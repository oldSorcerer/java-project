package ru.javarush.java.core.level19.task09;

public class Solution {
    public static void main(String[] args) {
        // Полиморфизм: переменная типа Vehicle ссылается на объект Car
        Vehicle car = new Car();

        // Вызов переопределённого метода move() у машины
        car.move(); // Ожидаемый вывод: "Машина едет"
    }
}