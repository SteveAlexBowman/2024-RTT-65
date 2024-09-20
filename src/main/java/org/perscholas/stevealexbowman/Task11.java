package org.perscholas.stevealexbowman;
/*
    Task 11: Write some Java code that asks the user how many favorite things they have.
    Based on their answer, you should create a String array of the correct size.
    Then ask the user to enter the things and store them in the array you created.
    Finally, print out the contents of the array.
 */
import java.util.Scanner;  // importing the library to use the scanner for user input

public class Task11 {
    public static void main(String[] args) {
        // Create Scanner
        Scanner userInput = new Scanner(System.in); // accepting the user's input from the console

        // Display prompt to the user
        System.out.println("How many favorite things do you own? Enter a whole number: ");

        // Store the user's input into a int variable
        int numberOfFavoriteThings = userInput.nextInt();// using method .nextInt() to ensure a whole number is entered
        userInput.nextLine(); // consume newline left-over

        // Creating an array the size of their numberOfFavoriteThings entered from the console
        String [] favoriteThings = new String [numberOfFavoriteThings];

        // Accepting the user's input from the console and storing that string in the array favoriteThings
        for (int i = 0; i < numberOfFavoriteThings; i++) {
            System.out.print("Enter favorite thing " + (i + 1) + ": ");
            favoriteThings[i] = userInput.nextLine();
        }

        // Displaying the user's favorite things to the console using a for each loop
        System.out.println("\nYour favorite things are: ");
        for(String thing : favoriteThings) {
            System.out.println(thing);
        }

        // Close the scanner
        userInput.close();
    }
}
