package org.perscholas.stevealexbowman;

/*
    Example of access array elements using enhanced for loops in Java
 */

public class AccessArrayElementsUsingEnhancedForLoop {
    public static void main(String[] args) {
        String[] names = {"New York", "Dallas", "Las Vegas", "Florida"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
