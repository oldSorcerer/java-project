package ru.javarush.java.core.level15.task12;

public class SchoolStudent {
    private int currentAge;

    public SchoolStudent(int currentAge) {
        this.currentAge = currentAge;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int potentialAge) {
        if (potentialAge < 0) {
            System.out.println("Внимание! Возраст студента не может быть отрицательным. Значение не обновлено.");
        } else {
            this.currentAge = potentialAge;
        }
    }
}
