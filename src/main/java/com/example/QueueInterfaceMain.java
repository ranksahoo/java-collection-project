package com.example;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceMain {
    public static void main(String[] args) {

		Guest john = new Guest("John", "Doe", false);
		Guest bob = new Guest("Bob", "Doe", false);
		Guest sonia = new Guest("Sonia", "Doe", true); //loyalty program
		Guest siri = new Guest("Siri", "Doe", true); //loyalty program

        // Queue<Guest> checkinQueue = new ArrayDeque<>();
       
        // checkinQueue.offer(john); //adds john to the queue
        // checkinQueue.offer(bob); //adds bob to the queue
        // checkinQueue.offer(sonia); //adds sonia to the queue
        // checkinQueue.offer(siri); //adds siri to the queue

        // print(checkinQueue); //prints the contents of the queue

        //  // Guest guest1 = checkinQueue.remove(); //removes and returns the head of the queue, or returns null if the queue is empty
        // Guest guest1 = checkinQueue.poll(); //removes and returns the head of the queue, or returns null if the queue is empty
        // print(checkinQueue); //prints the contents of the queue
        // System.out.println("Removed guest: " + guest1); //prints null since the queue is empty
	    
        // Guest guest2 = checkinQueue.peek();
        // print(checkinQueue); //prints the contents of the queue
        // System.out.println("Removed guest: " + guest2); //prints null since the queue is empty

        // checkinQueue.add(john); 
        // checkinQueue.add(bob); 
        // checkinQueue.add(sonia);
        // checkinQueue.add(siri);

        // print(checkinQueue); 

        // Guest guest1 = checkinQueue.remove();
        // print(checkinQueue); 
        // System.out.println("Removed guest: " + guest1);
	    
        // Guest guest2 = checkinQueue.element();
        // print(checkinQueue); 
        // System.out.println("Removed guest: " + guest2);

        Comparator<Guest> guestComparator = Comparator.comparing(Guest::isLoyaltyProgramMember).reversed();

        Queue<Guest> checkinQueue = new PriorityQueue<>(guestComparator);

        checkinQueue.add(john); 
        checkinQueue.add(bob); 
        checkinQueue.add(sonia);
        checkinQueue.add(siri);

        print(checkinQueue); 

        Guest guest1 = checkinQueue.remove();
        print(checkinQueue); 
        System.out.println("Removed guest: " + guest1);
	    
        Guest guest2 = checkinQueue.element();
        print(checkinQueue); 
        System.out.println("Removed guest: " + guest2);
    }   

	public static void print(Queue<Guest> queue) {

		System.out.format("%n--Queue Contents--%n");

		int x = 0;
		for(Guest guest : queue) {
			System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)":"");
		}
		
		System.out.println("");
		
	}
}
