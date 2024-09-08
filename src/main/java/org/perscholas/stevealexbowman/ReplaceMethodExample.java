package org.perscholas.stevealexbowman;

public class ReplaceMethodExample {
    public static void main(String[] args) {
        String str1 = "abc cba";

        // All occcurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));

        // All occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));

        // Character not in the string
        System.out.println("Hello".replace('4', 'J'));

        // All occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));

        // All occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // Substring not in the string
        System.out.println("Java".replace("C++", "C"));
    }
}
