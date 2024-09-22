package org.perscholas.stevealexbowman;

/*
    Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
    Create another variable sum and assign the value of ++x added to y, and print the result.
    Notice the value of the sum (should be 14).
    Now change the increment operator to postfix (x++) and re-run the program.
    Notice what the value of the sum is. The first configuration incremented x,
    and then calculated the sum, while the second configuration calculated the sum, and then incremented x.
 */

public class Task7 {
    public static void main(String[] args) {
        // Declaring two integer variables: x & y and assigning values to them

        int x = 5;
        int y = 8;

        // declaring another int variable sum and assigning the value of ++x = y to that variable
        // int sum = ++x + y; Pre increment operation on x that results in a sum of 14

        int sum = x++ + y; // post increment operation on x that results in a sum of 13

        System.out.println(sum); // printing the value of sum
    }
}
