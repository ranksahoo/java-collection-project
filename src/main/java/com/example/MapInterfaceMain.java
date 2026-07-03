package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapInterfaceMain {

    public static void main(String[] args) {
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);

		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", true);

        Map<Room, Guest> assignments = new HashMap<>();
        assignments.put(piccadilly, john);
        assignments.put(oxford, maria);

        Set<Entry<Room, Guest>> entries = assignments.entrySet();

        for (Entry<Room, Guest> entry : entries) {
            Room room = entry.getKey();
            Guest guest = entry.getValue();
            System.out.format("Room: %s, Guest: %s %s, %n", room.getName(), guest.getFirstName(), guest.getLastName());
        }

        System.out.println("Oxford: " + assignments.get(new Room("Oxford", "Suite", 5, 225.0)));
        System.out.println("Piccadilly: " + assignments.get(piccadilly));
    }
}
