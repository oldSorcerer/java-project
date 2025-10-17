package level19.task11;

public class Solution {
    public static void main(String[] args) {
        // Создаём менеджера "Ivan" с зарплатой 50000
        Manager manager = new Manager("Ivan", 50000);

        // Сначала выводим имя, затем зарплату
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
    }
}