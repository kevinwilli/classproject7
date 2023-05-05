package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Driver {
    public static void main(String[] args) {
        // declare a constant for the number of elements in the list and set it equal to
        // 1000.
        final int NUM_ELEMENTS = 100000;

        // Declare and instantiate an ArrayList for objects of your class.
        ArrayList<Animal> animalList = new ArrayList<Animal>();

        // Use a loop to add the specified number of randomly generated objects to the
        // list
        // for (int i = 0; i < NUM_ELEMENTS; i++) {
        //     animalList.add(new Animal());
        // }
        //print out the time it tooke to add the elements to the list
        long startAddTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            animalList.add(new Animal());
        }
        long endAddTime = System.nanoTime();
        System.out.println("Add ArrayList: " + (endAddTime - startAddTime) + " nanoseconds");

        // Sort the list using Collections.sort
        Collections.sort(animalList);
        //print out the time it took to sort the list
        long startSortTime = System.nanoTime();
        Collections.sort(animalList);
        long endSortTime = System.nanoTime();
        System.out.println("Sort ArrayList: " + (endSortTime - startSortTime) + " nanoseconds");

        //print out the list
        //System.out.println(animalList);


        // Shuffle the list using Collections.shuffle
        Collections.shuffle(animalList);
        //Use a loop to get a random element from the list 1,000,000 times.
        for (int i = 0; i < 1000000; i++) {
            animalList.get((int) (Math.random() * NUM_ELEMENTS));
        }
        //print out the time it took to shuffle the list
        long startSuffleTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            animalList.get((int) (Math.random() * NUM_ELEMENTS));
        }
        long endSuffleTime = System.nanoTime();
        System.out.println("Shuffle ArrayList: " + (endSuffleTime - startSuffleTime) + " nanoseconds");

        //Use a loop to get each element from the loop sequentially. (In other words, get the first element, then get the second element, then get the third element.)
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            animalList.get(i);
        }
        //print out the time it takes to get the all the elements from the list sequentially
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            animalList.get(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Sequentially From ArrayList: " + (endTime - startTime) + " nanoseconds");
       //print out the time it takes to get the all the elements from the list randomly
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            animalList.get((int) (Math.random() * NUM_ELEMENTS));
        }
        endTime = System.nanoTime();
        System.out.println("Randomly From ArrayList: " + (endTime - startTime) + " nanoseconds"); 
        //Add code that repeats the above using a LinkedList implementation
        // Declare and instantiate an LinkedList for objects of your class.
        LinkedList<Animal> animalLinkedList = new LinkedList<Animal>();

        // Use a loop to add the specified number of randomly generated objects to the
        // list
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            animalLinkedList.add(new Animal());
        }
        //print out the time it tooke to add the elements to the list
        startSortTime = System.nanoTime();
        Collections.sort(animalLinkedList);
        endSortTime = System.nanoTime();
        System.out.println("Add LinkedList: " + (endSortTime - startSortTime) + " nanoseconds");

        // Sort the list using Collections.sort
        // Collections.sort(animalLinkedList);
        //print out the time it took to sort the list
        startSortTime = System.nanoTime();
        Collections.sort(animalLinkedList);
        endSortTime = System.nanoTime();
        System.out.println("Sort LinkedList: " + (endSortTime - startSortTime) + " nanoseconds");


        // Shuffle the list using Collections.shuffle
        Collections.shuffle(animalLinkedList);
        //print out the time it took to shuffle the list
        startSuffleTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            animalLinkedList.get((int) (Math.random() * NUM_ELEMENTS));
        }
        endSuffleTime = System.nanoTime();
        System.out.println("Shuffle LinkedList: " + (endSuffleTime - startSuffleTime) + " nanoseconds");
        //Use a loop to get a random element from the list 1,000,000 times.
        for (int i = 0; i < 1000000; i++) {
            animalLinkedList.get((int) (Math.random() * NUM_ELEMENTS));
        }
        //print out the time it takes to get the all the elements from the list sequentially
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            animalLinkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Sequentially From LinkedList: " + (endTime - startTime) + " nanoseconds");
        //Use a loop to get each element from the loop sequentially. (In other words, get the first element, then get the second element, then get the third element.)
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            animalLinkedList.get(i);
        }
        //print out the time it takes to get the all the elements from the list randomly
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            animalLinkedList.get((int) (Math.random() * NUM_ELEMENTS));
        }
        endTime = System.nanoTime();
        System.out.println("Randomly From LinkedList: " + (endTime - startTime) + " nanoseconds");

    }
}
