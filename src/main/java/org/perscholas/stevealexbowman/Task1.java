package org.perscholas.stevealexbowman;

/*
    Write a program that declares an integer a variable x, assigns the value 2 to it,
    and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
    Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
    Before printing the results, write a comment with the predicted decimal value and binary string.
    Now, print out x in decimal form and in binary notation.

    Perform the preceding exercise with the following values:
        a. 9
        b. 17
        c. 88

 */

public class Task1 {
    public static void main(String[] args) {
        // Declaring an integer variable x -- assigning the value 2 to the integer variable
        int x = 2;

        // Printing out the binary string version of the variable x
        System.out.println("Value of x before the left shift in binary form: " + Integer.toBinaryString(x));
        System.out.println("Value of x before the left shift in decimal form: " + x);

        // Using the left shift operator (<<) to shift by 1 and assigning the result to x
        x = x << 1;

        System.out.println(); // Adding a line break for reader clarity

        // Predicted decimal value: 4; Predicted binary string: 0000 0100
        System.out.println("Value of x after the left shift in binary form: " + Integer.toBinaryString(x)); // value of x after the << left shift
        System.out.println("Value of x after the left shift in decimal form: " + x);

        System.out.println(); // Adding a line break for reader clarity
        System.out.println("Demonstrating left shift operations with the decimal number: 9 ");
        System.out.println(); // Adding a line break for reader clarity

        x = 9; // reassigning the value of x
        System.out.println("Value of x before the left shift in decimal form: " +x);
        System.out.println("Value of x before the left shift in binary form: " + Integer.toBinaryString(x)); // value of x before the << left shift

        System.out.println(); // adding a line break for reader clarity

        x = x << 1; // after reassignment of x -- left shift of the decimal number 9

        System.out.println("Value of x after the left shift in decimal form: " +x);
        System.out.println("Value of x after the left shift in binary form: " + Integer.toBinaryString(x));  // value of x after the << left shift

        System.out.println(); // Adding a line break for reader clarity
        System.out.println("Demonstrating left shift operations with the decimal number: 17 ");
        System.out.println(); // Adding a line break for reader clarity

        x = 17; // reassigning the value of x
        System.out.println("Value of x before the left shift in decimal form: " + x);
        System.out.println("Value of x before the left shift in binary form: " + Integer.toBinaryString(x));  // value of x before the << left shift

        System.out.println(); // adding a line break for reader clarity

        x = x << 1; // after reassignment of x -- left shift of the decimal number 9

        System.out.println("Value of x after the left shift in decimal form: " +x);
        System.out.println("Value of x after the left shift in binary form: " + Integer.toBinaryString(x));  // value of x after the << left shift

        System.out.println(); // Adding a line break for reader clarity
        System.out.println("Demonstrating left shift operations with the decimal number: 88 ");
        System.out.println(); // Adding a line break for reader clarity

        x = 88; // reassigning the value of x
        System.out.println("Value of x before the left shift in decimal form: " + x);
        System.out.println("Value of x before the left shift in binary form: " + Integer.toBinaryString(x));  // value of x before the << left shift

        System.out.println(); // adding a line break for reader clarity

        x = x << 1; // after reassignment of x -- left shift of the decimal number 9

        System.out.println("Value of x after the left shift in decimal form: " +x);
        System.out.println("Value of x after the left shift in binary form: " + Integer.toBinaryString(x));  // value of x after the << left shift
    }
}
