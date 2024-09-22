package org.perscholas.stevealexbowman;

/*
    Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
    Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.

 */

public class Task6 {
    public static void main(String[] args) {
        // Declaring and assigning a value to variable myNumber

        int myNumber = 23; // initial value of myNumber

        System.out.println("Initial Value of My Number: " + myNumber); // Initial value of myNumber

        myNumber++; // post incrementing myNumber

        System.out.println("My Number after 1st post increment: " + myNumber); // value of myNumber after post incrementing

        ++myNumber; // pre-incrementing myNumber

        System.out.println("My Number after 2nd pre increment: " + myNumber);

        myNumber += 1; // incrementing myNumber using the += operator

        System.out.println("My Number after 3rd increment using += operator: " + myNumber);
    }
}
