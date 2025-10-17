package level19.task10;

// Библиотека геометрических фигур: абстракция + конкретные реализации
public class Solution {
    public static void main(String[] args) {
        // Создаем объекты конкретных фигур
        Figure square = new Square(4); // квадрат со стороной 4
        Figure circle = new Circle(3); // круг с радиусом 3

        // Вызываем area() у каждой фигуры и выводим результат
        System.out.println(square.area());
        System.out.println(circle.area());
    }
}