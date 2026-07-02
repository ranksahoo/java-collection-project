package com.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
       
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.00);

        // Set<Room> rooms = new HashSet<>();
        Set<Room> rooms = new LinkedHashSet<>();

        rooms.add(piccadilly);
        rooms.add(oxford);
        rooms.add(oxford);
        rooms.add(oxfordDuplicate);
        rooms.add(victoria);
        
        // rooms.stream()
        // .map(r -> r.getName())
        // .forEach(System.out::println);

        Set<Room> otherRooms = Set.of(piccadilly, oxford);
        // otherRooms.add(victoria);  
        
        Set<Room> roomsCopy = Set.copyOf(rooms);
        // roomsCopy.add(victoria);

        roomsCopy.stream()
        .map(r -> r.getName())
        .forEach(System.out::println);

     }
}
