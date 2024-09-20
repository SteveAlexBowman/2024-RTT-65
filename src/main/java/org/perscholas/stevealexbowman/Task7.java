package org.perscholas.stevealexbowman;
/*
    Task 7: Write a program where you create an array of 5 elements.
    Loop through the array and print the value of each element, except for the middle (index 2) element.
 */
public class Task7 {
    public static void main(String[] args) {

        // Creating an array of 5 elements
        String [] sports = {"football", "basketball", "golf", "tennis", "soccer"};

        for (int i = 0; i< sports.length; i++) {

            if(i == 2){  // ensure that you use the == equals operator for the if statement to work
                continue;  // if the index is == to 2 then skip & continue the for-loop
            }

            System.out.println(sports[i]);  // displaying the elements of the array
        }
    }
}
