package org.perscholas.stevealexbowman;

public class ComputeTheSumAndAverageOfArray {
    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // Access all elements using for each loop
        // Add each element in sum

        for (int number: numbers) {
            sum += number;
        }

        // Get the total number of elements
        int arrayLength = numbers.length;

        // Calculate the aveage
        // Convert the average from int to double

        average = ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
