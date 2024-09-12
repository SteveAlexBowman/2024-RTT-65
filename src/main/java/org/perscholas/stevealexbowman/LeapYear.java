package org.perscholas.stevealexbowman;

import java.util.Scanner;  // considered a class in Java

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an Year :: ");
        Scanner scanYear = new Scanner(System.in);

        year = scanYear.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Specified year is a leap year.");

        } else{
            System.out.println("Specified year is not a leap year.");
        }
    }
}
