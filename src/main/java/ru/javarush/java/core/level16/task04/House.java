package ru.javarush.java.core.level16.task04;

public class House {

    private final String houseAddress;

    public House(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public class Room {
        private final String roomIdentifier;

        public Room(String roomIdentifier) {
            this.roomIdentifier = roomIdentifier;
        }

        public void printAddresses() {
            System.out.println(this.roomIdentifier);
            System.out.println(House.this.houseAddress);
        }

    }
}
