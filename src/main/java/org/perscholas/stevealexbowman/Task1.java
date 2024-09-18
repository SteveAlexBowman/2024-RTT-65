package org.perscholas.stevealexbowman;

/*Task 1: Write a program that creates an array of integers with a length of 3.
Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/

public class Task1 {
    public static void main(String[] args) {

        // Array of integers with a length of 3
        int[] integers =  {1,2,3};

        // print out each array element
        System.out.println(integers[0]);
        System.out.println(integers[1]);
        System.out.println(integers[2]);

        /*
            Example of executing an array of integers with the enhanced for-loop
         */

        for(int intNum: integers) {
            System.out.println(intNum);
        }




    }
}
