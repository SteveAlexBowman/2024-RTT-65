package org.perscholas.stevealexbowman;
/*
    Java program demonstrating a nested for-loops resulting
    in a console output that resembles a pyramid; although,
    the output more closely resembles a right-angle  :)
 */


public class PyramidExample {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++) {
           for(int j = 1; j <=i; j++){
               System.out.print("* ");
           }
           System.out.println();  // New Line
        }
    }
}
