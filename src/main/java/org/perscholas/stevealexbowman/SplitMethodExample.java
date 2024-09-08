package org.perscholas.stevealexbowman;
import java.util.Arrays;

public class SplitMethodExample {
   public static void main(String[] args) {
       String vowels = "a::b::c::d:e";

       // Splitting the string at "::"
       // Storing the result in an array of strings
       String[] result = vowels.split("::");

       // Converting array to string and printing it
       System.out.println("result = " + Arrays.toString(result));
   }
}
