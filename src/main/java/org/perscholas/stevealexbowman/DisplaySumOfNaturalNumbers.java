package org.perscholas.stevealexbowman;

// Program to find the sum of natural numbers from 1 to 1000.
public class DisplaySumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;

        // for Loop
        for(int i =1; i <= n; ++i){
            //body inside for loop
            sum +=i;  // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }
}
