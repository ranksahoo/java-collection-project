package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorsMain {

    public static class Room implements Comparable<Room>{
        public static Comparator<Room> RATE_COMPARATOR = Comparator.comparingDouble(Room::getRate)
                .thenComparing(Room::getName)
                .thenComparing(Room::getType);

        private String name;

        private String type;

        private int capacity;

        private double rate;
        
        private boolean petFriendly;

        public Room(String name, String type, int capacity, double rate) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
            this.rate = rate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }
        
        public boolean isPetFriendly() {
            return petFriendly;
        }

        public void setPetFriendly(boolean petFriendly) {
            this.petFriendly = petFriendly;
        }

        @Override
        public String toString() {
            return "Room [name=" + name + ", type=" + type + ", capacity=" + capacity + ", rate=" + rate + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            long temp;
            temp = Double.doubleToLongBits(rate);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
                    
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Room other = (Room) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (Double.doubleToLongBits(rate) != Double.doubleToLongBits(other.rate))
                return false;
            return true;
        }

        @Override
        public int compareTo(Room o) {
            int result = this.getName().compareTo(o.getName());
            return result != 0 ? result : this.getType().compareTo(o.getType());
        }

    }
    public static void main(String[] args) {
       Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room oxfordGuest = new Room("Oxford", "Guest Room", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.0);
		
		List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxfordGuest, cambridge, victoria, oxford));
		
		// rooms.sort(Comparator.naturalOrder());
        // rooms.sort(Room.RATE_COMPARATOR);
        rooms.sort(Room.RATE_COMPARATOR.reversed());
		
		rooms.stream()
			.forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));      
    }
}
