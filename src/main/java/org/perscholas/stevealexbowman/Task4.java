package org.perscholas.stevealexbowman;

/*
    Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
    The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
    Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
    Now try to assign a value to the array index 5. You should get the same type of exception.
 */

import java.lang.reflect.Array;

public class Task4 {
    public static void main(String[] args) {
        // Creating an integer array with 5 elements
        int [] numbers = {20, 33, 21, 18, 36};

        // Print out the value at the first index and the last index using length - 1 as the index.
        System.out.println("First number is: " + numbers[numbers.length - 5]); // Printing out the first number in the array
        System.out.println("Last number is: " + numbers[numbers.length - 1]); // Printing out the last number in the array

        System.out.println(numbers[numbers.length]);
        /*
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	        at org.perscholas.stevealexbowman.Task4.main(Task4.java:19)
         */

        Array.set(numbers, 5, 99);  // using the Array.set() method to attempt a placement beyond array length

        /*
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
	        at java.base/java.lang.reflect.Array.set(Native Method)
	        at org.perscholas.stevealexbowman.Task4.main(Task4.java:27)
         */


    }
}
