package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingCollectionMain {

    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
		
		Collection<Room> rooms = new ArrayList<>(Arrays.asList(piccadilly, cambridge, westminister));
        Iterator<Room> roomIterator = rooms.iterator();
        System.out.println("Iterating over rooms using Iterator:");
        // while (roomIterator.hasNext()) {
        //     Room room = roomIterator.next();
        //     System.out.println(room.getName() + " - " + room.getType() + " - Capacity: " + room.getCapacity() + " - Price: $" + room.getRate());       
        // }
		for(Room room : rooms) {
            System.out.println(room.getName() + " - " + room.getType() + " - Capacity: " + room.getCapacity() + " - Price: $" + room.getRate());
        }
    }
}
