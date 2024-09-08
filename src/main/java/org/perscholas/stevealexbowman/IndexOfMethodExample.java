package org.perscholas.stevealexbowman;

public class IndexOfMethodExample {
    public static void main (String[] args) {
        String str1 = "Java is fun";
        int result;

        // getting index of character 's'
        result = str1.indexOf('s');

        System.out.println(result);  // 6

        // Getting index of character 'J'
        result = str1.lastIndexOf('J');
        System.out.println(result);  // 0

        // The last occurence of 'a' is returned
        result = str1.lastIndexOf('a');
        System.out.println(result);  // 3

        // Character not in the string
        result = str1.lastIndexOf('j');
        System.out.println(result);  // -1

        // Getting the last occurrence of "ava"
        result = str1.lastIndexOf("ava");
        System.out.println(result); // 1

        // Substring not in the string
        result = str1.lastIndexOf("java");
        System.out.println(result);  // -1
    }
}
