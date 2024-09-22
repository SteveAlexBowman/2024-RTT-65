package org.perscholas.stevealexbowman;

/*

    Create a program that lets the users input their filing status and income.
    Display how much tax the user would have to pay according to status and income.
    The U.S. federal personal income tax is calculated based on the filing status and taxable income.
    There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.

*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {


        // Create Scanner to accept the user income

        Scanner scannerInput = new Scanner(System.in); // creating scanner to accept user input

        System.out.println("Enter your income as a whole number: ");  // prompting the user to enter their income
        double income = scannerInput.nextDouble(); // long variable to store the users income

        System.out.println("Enter your filing status:\n1: Single\n2: Married Filing Jointly or Qualifying Widow(er)\n3: Married Filling Separetely\n4: Head of Household ");
        int filingStatus = scannerInput.nextInt();

        // Filing Single

        if (filingStatus == 1 && income <= 8350) {
            // Tax payer is single and should be accessed the appropriate marginal tax rate
            income = (income * 0.10);
            System.out.println("You are filing `Single`, have a marginal tax rate of 10% and owe: $" + income);
        } else if (filingStatus == 1 && income >= 8351 && income <= 33950) {
            income = (income * 0.15);
            System.out.println("You are filing `Single`, have have a marginal tax rate of 15% and owe: $" + income);
        } else if (filingStatus == 1 && income >= 33951 && income <= 82250) {
            income = (income * 0.25);
            System.out.println("You are filing `Single`, have a marginal tax rate of 25% and owe: $" + income);
        } else if (filingStatus == 1 && income >= 82251 && income <= 171550) {
            income = (income * 0.28);
            System.out.println("You are filing `Single`, have a marginal tax rate of 28% and owe: $" + income);

        } else if (filingStatus == 1 & income >= 171551 && income <= 372950) {
            income = (income * 0.33);
            System.out.println("You are filing `Single`, have a marginal tax rate of 33% and owe: $" + income);
        } else if (filingStatus == 1 && income >= 372951) {
            income = (income * 0.35);
            System.out.println("You are filing `Single`, have a marginal tax rate of 35% and owe: $" + income);

            //Married Filing Jointly or a Qualifying Widow(er)

        } else if (filingStatus == 2 && income >= 0 && income <= 16700) {
            income = (income * 0.10);
            System.out.println("You are Married Filing Jointly or a Qualifying Widow(er) with a marginal tax rate of 10% and owe: $" + income);
        } else if (filingStatus == 2 && income >= 16701 && income <= 67900) {
            income = (income * 0.15);
            System.out.println("You are Married Filing Jointly or a Qualifying Widow(er) with a marginal tax rate of 15% and owe: $" + income);
        } else if (filingStatus == 2 && income >= 67901 && income <= 137050) {
            income = (income * 0.25);
            System.out.println("You are Married Filing Jointly or a Qualifying Widow(er) with a marginal tax rate of 25% and owe: $" + income);
        } else if (filingStatus == 2 && income >= 137051 && income <= 208850) {
            income = (income * 0.28);
            System.out.println("You are Married Filing Jointly or a Qualifying Widow(er) with a marginal tax rate of 28% and owe: $" + income);
        } else if (filingStatus == 2 && income >= 208851 && income <= 372850) {
            income = (income * 0.33);
            System.out.println("You are Married Filing Jointly or a Qualifying Widow(er) with a marginal tax rate of 33% and owe: $" + income);
        } else if (filingStatus == 2 && income >= 372951) {
            income = (income * 0.35);
            System.out.println("You are Married Filing Jointly or a Qualifying Widow(er) with a marginal tax rate of 35% and owe: $" + income);

            // Married Filing Separately

        } else if (filingStatus == 3 && income >= 0 && income <= 8350) {
            income = (income * 0.10);
            System.out.println("You are Married Filing Separately with a marginal tax rate of 10% and owe: $" + income);
        } else if (filingStatus == 3 && income >= 8351 && income <= 33950) {
            income = (income * 0.15);
            System.out.println("You are Married Filing Separately with a marginal tax rate of 15% and owe: $" + income);
        } else if (filingStatus == 3 && income >= 33951 && income <= 68525) {
            income = (income * 0.25);
            System.out.println("You are Married Filing Separately with a marginal tax rate of 25% and owe: $" + income);
        } else if (filingStatus == 3 && income >= 68526 && income <= 104425) {
            income = (income * 0.28);
            System.out.println("You are Married Filing Separately with a marginal tax rate of 28% and owe: $" + income);
        } else if (filingStatus == 3 && income >= 104426 && income <= 186475) {
            income = (income * 0.33);
            System.out.println("You are Married Filing Separately with a marginal tax rate of 33% and owe: $" + income);
        } else if (filingStatus == 3 && income >= 186476) {
            income = (income * 0.35);
            System.out.println("You are Married Filing Separately with a marginal tax rate of 35% and owe: $" + income);

        }

        // Head of Household

        else if (filingStatus == 4 && income >= 0 && income <= 11950) {
            income = (income * 0.10);
            System.out.println("You are Filing Head of Household with a marginal tax rate of 10% and owe: $" + income);
        } else if (filingStatus == 4 && income >= 11951 && income <= 45500) {
            income = (income * 0.15);
            System.out.println("You are Filing Head of Household with a marginal tax rate of 15% and owe: $" + income);
        } else if (filingStatus == 4 && income >= 45501 && income <= 117450) {
            income = (income * 0.25);
            System.out.println("You are Filing Head of Household with a marginal tax rate of 25% and owe: $" + income);
        } else if (filingStatus == 4 && income >= 117451 && income <= 190200) {
            income = (income * 0.28);
            System.out.println("You are Filing Head of Household with a marginal tax rate of 28% and owe: $" + income);
        } else if (filingStatus == 4 && income >= 190201 && income <= 372950) {
            income = (income * 0.33);
            System.out.println("You are Filing Head of Household with a marginal tax rate of 33% and owe: $" + income);
        } else if (filingStatus == 4 && income >= 372951) {
            income = (income * 0.35);
            System.out.println("You are Filing Head of Household with a marginal tax rate of 35% and owe: $" + income);

        }
    }
}
