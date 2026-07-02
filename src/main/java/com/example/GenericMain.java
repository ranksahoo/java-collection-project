package com.example;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMain {
    protected static class Room {
        private String name;
        private String type;
        private int capacity;
        private double rate;

        public Room(String name, String type, int capacity, double rate) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
            this.rate = rate;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }

        public double getRate() {
            return rate;
        }
    }
    public static void main(String[] args) {
       Collection<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Room 101", "Single", 1, 100.0));
        rooms.add(new Room("Room 102", "Double", 2, 150.0));
        rooms.add(new Room("Room 103", "Suite", 4, 300.0));
        rooms.add(new Room("Room 104", "Single", 1, 120.0));

        rooms.stream()
                .forEach(room -> System.out.println(room.getName()));
    }
}
