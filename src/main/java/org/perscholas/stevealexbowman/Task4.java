package org.perscholas.stevealexbowman;
/*

    Write a program that declares 1 integer variable x, and then assigns 15 to it.
    Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and
    prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).

    Change x to 5 and notice the result.

 */
public class Task4 {
    public static void main(String[] args) {
        // Declaring an integer variable and assigning a value to it
        int x = 5;

        // Writing if else statement to determine the appropriate output to display based on the input values
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else if (x >= 10 && x <= 20 ) {
            System.out.println("In range");
        };
    }
}
