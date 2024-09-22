package org.perscholas.stevealexbowman;

/*
    Write a program that declares an integer variable, assigns a number,
    and uses a postfix increment operator to increase the value.
    Print the value before and after the increment operator.

 */
public class Task5 {
    public static void main(String[] args) {
        // Declaring an integer variable and assigning a number value

        int myNumber = 23;
        System.out.println("My number before the post increment: " + myNumber); // print the number before the post increment

        myNumber++; // post incrementing myNumber by 1

        System.out.println("My number after the post increment: " + myNumber); // printing my number after the post increment

    }
}
