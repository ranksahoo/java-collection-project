package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindingElementsMain {

    public static void main(String[] args) {
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room oxford1 = new Room("Oxford", "Guest Room", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.0);
		
		List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxford1, cambridge, victoria, oxford));
		rooms.sort(Room.RATE_COMPARATOR);
		
        int result = Collections.binarySearch(rooms, oxford, Room.RATE_COMPARATOR);
        if (result >= 0) {
            System.out.format("%nFound %s at index %d%n", oxford, result);
        } else {
            System.out.format("%n%s not found. Insertion point: %d%n", oxford, -result - 1);
        }  
        
        Room newLondon = new Room("New London", "Guest Room", 3, 125.00);
        result = Collections.binarySearch(rooms, newLondon, Room.RATE_COMPARATOR);
        if (result >= 0) {
            System.out.format("%nFound %s at index %d%n", newLondon, result);
        } else {
            System.out.format("%n%s not found. Insertion point: %d%n", newLondon, -result - 1);
        }
        rooms.add(Math.abs(++result), newLondon);

        System.out.println("Minimum Rate: " + Collections.min(rooms, Room.RATE_COMPARATOR).getName());
        System.out.println("Maximum Rate: " + Collections.max(rooms, Room.RATE_COMPARATOR).getName());

		System.out.format("%n%n--List Contents--%n");
		rooms.stream()
			.forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));
    }
}
