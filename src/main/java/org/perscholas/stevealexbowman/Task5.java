package org.perscholas.stevealexbowman;

/*

Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:

A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: <60

Use the Scanner class to accept a number score from the user to determine the letter grade.
Print out “Score out of range” if the score is less than 0 or greater than 100.


 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        // Creating a Scanner to accept the user input
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter your score to determine your letter grade: ");

        int userScore = scannerInput.nextInt();  // accepts a integer number from the user and stores that value in userScore

        // A: 90-100
        if (userScore >= 90 && userScore <= 100 ) {
            System.out.println("You earned an A!");
        } else if (userScore >= 80 && userScore < 90 ) {
            System.out.println("You earned an B!");
        } else if (userScore >= 70 && userScore < 80 ) {
            System.out.println("You earned an C!");
        } else if (userScore >= 60 && userScore < 70 ) {
            System.out.println("You earned an D!");
        } else if (userScore <= 60 && userScore >= 0 ) {
            System.out.println("You earned an F!");
        } else if (userScore <= -1 || userScore > 100 ) {
            System.out.println("Score out of range");
        }


    }
}
