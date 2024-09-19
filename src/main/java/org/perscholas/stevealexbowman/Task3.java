package org.perscholas.stevealexbowman;

/*
    Task 3: Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
    Print out the array length. Make a copy using the clone( ) method.
    Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
 */

import java.util.Arrays;  // package has to be imported to use with Arrays.toString() on line #22

public class Task3 {
    public static void main(String[] args) {

        // String array initialized with colors
        String [] colors = {"red", "green", "blue", "yellow"};
        String [] clonedColors = colors.clone();  // cloning colors using the .clone() method

        System.out.println("Original Colors Array Length: " + colors.length); // Printing out the length of colors array

        System.out.println("Cloned Colors: " + Arrays.toString(clonedColors));  // displaying the contents of the clone

        }

    }
