package level19.task03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Коллекция, способная хранить объекты типа Vehicle (полиморфизм)
        List<Vehicle> vehicles = new ArrayList<>();

        // Добавляем по одному объекту Car и Bicycle
        vehicles.add(new Car());
        vehicles.add(new Bicycle());

        // Проходимся по коллекции и "оживляем" транспорт, вызывая move()
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}