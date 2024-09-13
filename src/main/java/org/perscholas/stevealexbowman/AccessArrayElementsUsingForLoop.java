package org.perscholas.stevealexbowman;

/*
    Example of Accessing Array Elements using a for loop in Java
 */

public class AccessArrayElementsUsingForLoop {
    public static void main(String[] args) {

        // create an Array
        int [] age = {12, 4, 5};

        // Loop through the array
        // Using for loop

        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }
}
