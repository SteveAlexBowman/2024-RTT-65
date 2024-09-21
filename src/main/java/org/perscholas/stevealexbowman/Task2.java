package org.perscholas.stevealexbowman;

/*
    Write a program that declares a variable x, and assigns 150 to it,
    and prints out the binary string version of the number.
    Now use the right shift operator (>>) to shift by 2 and assign the result to x.
    Write a comment indicating what you anticipate the decimal and binary values to be.
    Now print the value of x and the binary string.

    Perform the preceding exercise with the following values:

        a. 225
        b. 1555
        c. 32456

 */

public class Task2 {
    public static void main(String[] args) {

        // Declaring an integer variable x -- assigning the value 150 to the integer variable
        int x = 150;

        // Printing out the binary string version of the variable x
        System.out.println("Value of x before the right shift in binary form: " + Integer.toBinaryString(x));
        System.out.println("Value of x before the right shift in decimal form: " + x);

        // Using the right shift operator (>>) to shift by 2 and assigning the result to x
        x = x >> 2;

        System.out.println(); // Adding a line break for reader clarity

        // Predicted decimal value: ; Predicted binary string:
        System.out.println("Value of x after the right shift in binary form: " + Integer.toBinaryString(x)); // value of x after the >> right shift
        System.out.println("Value of x after the right shift in decimal form: " + x);

        System.out.println(); // Adding a line break for reader clarity
        System.out.println("Demonstrating right shift operations with the decimal number: 225 ");
        System.out.println(); // Adding a line break for reader clarity

        x = 225; // reassigning the value of x
        System.out.println("Value of x before the right shift in decimal form: " +x);
        System.out.println("Value of x before the right shift in binary form: " + Integer.toBinaryString(x)); // value of x before the >> right shift

        System.out.println(); // adding a line break for reader clarity

        x = x >> 2; // after reassignment of x -- right shift of the decimal number 225

        System.out.println("Value of x after the right shift in decimal form: " +x);
        System.out.println("Value of x after the right shift in binary form: " + Integer.toBinaryString(x));  // value of x after the >> right shift

        System.out.println(); // Adding a line break for reader clarity
        System.out.println("Demonstrating right shift operations with the decimal number: 1555 ");
        System.out.println(); // Adding a line break for reader clarity

        x = 1555; // reassigning the value of x
        System.out.println("Value of x before the right shift in decimal form: " + x);
        System.out.println("Value of x before the right shift in binary form: " + Integer.toBinaryString(x));  // value of x before the >> right shift

        System.out.println(); // adding a line break for reader clarity

        x = x >> 2; // after reassignment of x -- right shift of the decimal number 1556

        System.out.println("Value of x after the right shift in decimal form: " +x);
        System.out.println("Value of x after the right shift in binary form: " + Integer.toBinaryString(x));  // value of x after the >> right shift

        System.out.println(); // Adding a line break for reader clarity
        System.out.println("Demonstrating right shift operations with the decimal number: 32456 ");
        System.out.println(); // Adding a line break for reader clarity

        x = 32456; // reassigning the value of x
        System.out.println("Value of x before the right shift in decimal form: " + x);
        System.out.println("Value of x before the right shift in binary form: " + Integer.toBinaryString(x));  // value of x before the >> right shift

        System.out.println(); // adding a line break for reader clarity

        x = x >> 2; // after reassignment of x -- right shift of the decimal number 32456

        System.out.println("Value of x after the right shift in decimal form: " +x);
        System.out.println("Value of x after the right shift in binary form: " + Integer.toBinaryString(x));
    }
}
