package ru.javarush.java.core.level16.task03;

public class Library {

    public void addScroll(String scrollTitle) {

    }

    public class Scroll {
        private final String scrollTitle;

        public Scroll(String scrollTitle) {
            this.scrollTitle = scrollTitle;
        }

        public void revealTitle() {
            System.out.println(scrollTitle);
        }
    }
}
