package org.perscholas.stevealexbowman;
/*

    Write a program that declares 1 integer variable x, and then assigns 7 to it.
    Write an if-else statement that prints out “Less than 10” if x is less than 10,
    and “Greater than 10” if x is greater than 10.
    Change x to 15 and notice the result.
 */

public class Task2 {
    public static void main(String[] args) {
        // Declaring a integer variable x and assigning 7 to it

        int x = 15;

        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }
}
