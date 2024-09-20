package org.perscholas.stevealexbowman;
/*
    Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
 */
import java.util.ArrayList;

public class Task10 {
    public static void main(String[] args) {
        // Creating an array that includes an integer, 3 strings, and 1 double

        ArrayList<Object> mixedTypes = new ArrayList<Object>();

        // Inserting 3 String value in mixedTypes
        mixedTypes.add("Steve");
        mixedTypes.add("Jack");
        mixedTypes.add("Kelly");

        // Inserting an integer into the ArrayList
        mixedTypes.add(12);  // int

        // Inserting a double into the ArrayList

        mixedTypes.add(4.75); // double

        System.out.println(mixedTypes);
    }
}
