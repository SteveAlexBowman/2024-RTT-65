package org.perscholas.stevealexbowman;

import java.util.HashSet;

public class ExampleThree {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> addNumbers = new HashSet<>();
        addNumbers.add(1);
        addNumbers.add(3);
        addNumbers.add(5);
        System.out.println("HashSet2: " + addNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(addNumbers);
        System.out.println("Difference: " + primeNumbers);
    }
}
