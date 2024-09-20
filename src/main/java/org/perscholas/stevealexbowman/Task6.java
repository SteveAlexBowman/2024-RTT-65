package org.perscholas.stevealexbowman;
/*
    Task 6: Write a program where you create an integer array of 5 numbers.
    Loop through the array and assign the value of the loop control variable
    multiplied by 2 to the corresponding index in the array.
 */
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        // Creating an integer array of 5 numbers
        int [] numbers = {10, 23, 41, 56, 92};

        System.out.println("Original Array: "+ Arrays.toString(numbers));  // Displaying the original array

        for (int i=0; i<numbers.length; i++ ) {
            numbers[i] = (i*2);  // ensure assignment orientation; flipping the variables results in a different result
            System.out.println(Arrays.toString(numbers));  // Displaying the iteration & element replacement within the array
        }
    }
}
