package ru.javarush.java.core.level22.task20;

public class FlexibleUser {

    private String name;
    private int age;

    public FlexibleUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "FlexibleUser{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
