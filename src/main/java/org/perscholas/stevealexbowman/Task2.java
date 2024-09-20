package org.perscholas.stevealexbowman;
/*
    Task 2: Write a program that returns the middle element in an array.
    Give the following values to the integer array:
    {13, 5, 7, 68, 2} and produce the following output: 7

 */
public class Task2 {
    public static void main(String[] args) {
        int[] integers =  {13, 5, 7, 68, 2};


            int n = integers.length;  // determining the number of elements within the array
            int middleNum = n/2;  // isolating the middle number within the array

            System.out.println(integers[middleNum]);  // displaying the middle number after isolating the element

    }
}
