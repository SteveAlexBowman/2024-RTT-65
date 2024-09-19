package org.perscholas.stevealexbowman;

/*
Task 9:

Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.

Print the array in ascending order, and print the smallest and the largest element of the array.

The output will look like the following:

    Array in ascending order: 0, 1, 2, 4, 9, 13
    The smallest number is 0
    The biggest number is 13

 */

import java.util.Arrays;  // Library that has methods that are important for manipulating arrays

public class Task9 {
    public static void main(String[] args) {
        // Creating an array of 6 integers

        int [] numbers = {4, 2, 9, 13, 1, 0};  // The initial array before sorting

        Arrays.sort(numbers); // sort the array in ascending order

        System.out.println("Array in  ascending order: " + Arrays.toString(numbers));
        System.out.println("The smallest number is: " + numbers[0]); // after sorting the smallest integer will be at index [0]
        System.out.println("The largest number is: " + numbers[numbers.length-1]);  // after sorting the biggest number is at the last index position
    }
}
