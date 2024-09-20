package org.perscholas.stevealexbowman;
/*
    Task 8: Write a program that creates a String array of 5 elements
    and swaps the first element with the middle element without creating a new array.
 */
public class Task8 {
    public static void main(String[] args) {
        // Creating an array of 5 string elements

        String[] cities = {"Atlanta", "Boston", "Miami", "Houston", "Bronx"};

        System.out.println("Before Sapping the Cities:");
        System.out.println();  // Adding space for reader clarity

        for (String element : cities) {  /*
                                             For each element in the cities array, the variable element temporarily
                                             holds the value of the current element being processed
                                            */

            System.out.println(element + " ");  // inside the loop, each city in the array is printed out
        }

        // Swapping the elements at the first and middle index 0 & 2
        String temp = cities[0];  // Temp variable is used to hold the value of the first element; needed for swapping
        cities[0] = cities[2];  // Assigning value of cities [2] to cities [0]
        cities[2] = temp;  // value stored in temp is assigned to cities[2]

        // Displaying the title for the modified array
        System.out.println("\n\nArray after swapping the first and middle elements: ");

        System.out.println();  // Adding space for reader clarity

        // Printing the modified array
        for (String element : cities) {
            System.out.println(element + " ");
        }
    }
}
