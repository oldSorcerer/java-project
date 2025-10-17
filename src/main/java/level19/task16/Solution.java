package level19.task16;

// Демонстрация абстракции и полиморфизма на примере обработки заказов
public class Solution {
    public static void main(String[] args) {
        // Создаем массив базового типа Order — он может хранить объекты любых подклассов
        Order[] orders = {
                new OnlineOrder(100.0),
                new OfflineOrder(50.0),
                new OnlineOrder(299.99),
                new OfflineOrder(75.5)
        };

        // Полиморфизм: для каждого заказа вызывается его вариант метода process()
        for (Order order : orders) {
            order.process();
        }
    }
}