package com.example;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionMain {

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
        //Add some rooms
        Room room1 = new Room("Room 101", "Single", 1, 100.0);
        Room room2 = new Room("Room 102", "Double", 2, 150.0);
        Room room3 = new Room("Room 103", "Suite", 4, 300.0);
        Room room4 = new Room("Room 104", "Single", 1, 120.0);

        Collection<Room> rooms = List.of(room1, room2, room3, room4);
        double potentialRevenue = getPotentialRevenue(rooms);
        System.out.println("Potential Revenue: $" + potentialRevenue);

        Collection<String> c = new ArrayList<>();
        c.add("snowboard");
        c.add("skis");
        c.add("books");
        c.add("snowboard");
        
        Collection<String> c2 = new HashSet<>(c);
        System.out.println("Collection c: " + c);
        System.out.println("Collection c2 (HashSet): " + c2);
    }

    private static double getPotentialRevenue(Collection<Room> rooms) {
        return rooms.stream()
                    .mapToDouble(Room::getRate)
                    .sum();
    }
}
