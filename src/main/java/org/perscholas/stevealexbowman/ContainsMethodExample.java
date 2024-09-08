package org.perscholas.stevealexbowman;

public class ContainsMethodExample {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        Boolean result;

        // Check if str1 contains "Java"
        result = str1.contains("Java");
        System.out.println(result);  // True

        // Check if str1 contains "Python"
        result = str1.contains("Python");
        System.out.println(result);  // False

        // Check if str1 contains ""
        result = str1.contains("");

        System.out.println(result);  // True
    }
}
