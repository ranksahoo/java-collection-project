package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(500, 1500, 2500, 1000, 3000, 2000);
       NavigableSet<Integer> numberTree = new TreeSet<>(numbers);
    //    numberTree.stream()
    //         .forEach(System.out::println);

        // numberTree.descendingSet().stream()
        //     .forEach(System.out::println);

        // numberTree.headSet(2000).stream()
        //     .forEach(System.out::println);

        //  numberTree.tailSet(2000).stream()
        //     .forEach(System.out::println);


        //  numberTree.subSet(2000, 3000).stream()
        //     .forEach(System.out::println);
        // System.out.println(numberTree.lower(2000));
        System.out.println(numberTree.higher(2000));
    }
}
