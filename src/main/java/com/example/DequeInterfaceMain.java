package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceMain {
    public static void main(String[] args) {
        Deque<String> messageStack = new ArrayDeque<>();
        messageStack.push("Message 1");
        print(messageStack);
        messageStack.push("Message 2");
        print(messageStack);
        messageStack.push("Message 3");
        print(messageStack);
        messageStack.push("Message 4");
        print(messageStack);

        System.out.println(messageStack.pop());
        System.out.println(messageStack.pop());
        System.out.println(messageStack.peek());
        print(messageStack);
    }

    public static void print(Deque<String> deque) {
        System.out.format("%n--Printing the deque--%n");
        int x = 0;
        for (String message : deque) {
            System.out.format("%x: %s %s %n", x++, message, x == 1 ? "(Top)":"");
        }
        System.out.println("");
    }
}
