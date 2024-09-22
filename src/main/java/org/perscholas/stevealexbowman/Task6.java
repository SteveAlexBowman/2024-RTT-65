package org.perscholas.stevealexbowman;

/*

    Write a program that accepts an integer between 1 and 7 from the user.
    Use a switch statement to print out the corresponding weekday.
    Print “Out of range” if the number is less than 1 or greater than 7.
    Do not forget to include “break” statements in each of your cases.
 */


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Creating a Scanner
        Scanner scannerInput = new Scanner(System.in);

        System.out.println("Enter a number 1 - 7: ");  // displaying the prompt to the user
        int userNumber = scannerInput.nextInt();  // accepting an integer value from the user and assigning that value to userNumber

        // Writing a switch statement

        switch (userNumber) {
            case 1: System.out.println("The day of the week is: Sunday"); break;
            case 2: System.out.println("The day of the week is: Monday"); break;
            case 3: System.out.println("The day of the week is: Tuesday"); break;
            case 4: System.out.println("The day of the week is: Wednesday"); break;
            case 5: System.out.println("The day of the week is: Thursday"); break;
            case 6: System.out.println("The day of the week is: Friday"); break;
            case 7: System.out.println("The day of the week is: Saturday"); break;
            default: System.out.println("The number you entered is: Out of range");

        }
    }
}
