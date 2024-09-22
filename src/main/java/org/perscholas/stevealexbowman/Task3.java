package org.perscholas.stevealexbowman;

/*
    Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
    Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
    Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
 */

public class Task3 {
    public static void main(String[] args) {
        // Declaring three int variables x, y, and z while assigning values to x & y

        int x = 7;
        int y = 17;
        int z = y &= x;

        System.out.println(Integer.toBinaryString(x));  // Determining Binary value of x
        System.out.println(Integer.toBinaryString(y));


        // Comment: Bitwise AND (&) operation prediction: 10010

            // Binary: 10010 ; Decimal: 18;

        // Using the bitwise AND (&) operator to derive the decimal and binary values and assigning the result to z
        System.out.println(Integer.toBinaryString(z));

    }
}
