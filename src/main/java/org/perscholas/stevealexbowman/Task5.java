package org.perscholas.stevealexbowman;
/*
    Task 5: Write a program where you create an integer array with a length of 5.
    Loop through the array and assign the value of the loop control variable
    (e.g., i) to the corresponding index in the array.
 */
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        // Creating integer array with length of 5
        int [] integers = {77, 31, 42, 66, 95};

        System.out.println("Original Array: "+ Arrays.toString(integers));  // Displaying the original array

        for (int i=0; i<integers.length; i++ ) {
            integers[i] = i;  // ensure assignment orientation; flipping the variables results in a different result
            System.out.println(Arrays.toString(integers));  // Displaying the iteration & element replacement within the array
        }
    }
}
