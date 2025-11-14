package ru.javarush.java.core.level16.task02;

public class Person {
    private final String userName;

    public Person(String userName) {
        this.userName = userName;
    }

    public class Greeting {

        public void sayHello() {
            System.out.println("Hello, " + userName);
        }
    }

}
