package org.perscholas.stevealexbowman;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // Define the student names
        String[] students = {"Takeisha", "Erica", "Md", "Brian", "Yu Chen"};

        // Define the subjects
        String[] subjects = {"Java", "Python", "Data", "SQL"};

        // Define the grades array
        int[][] grades = {
                {95, 98, 100, 96},
                {100, 95, 98, 100},
                {97, 100, 96, 99},
                {98, 95, 98, 95},
                {90, 100, 94, 98}
        };

        // Print the header (subject names)
        System.out.printf("%-25s", " "); // Leave space for student names
        for (String subject : subjects) {
            System.out.printf("%-30s", subject); // Print subjects aligned
        }
        System.out.println();
        System.out.println();// New line

        // Print each student name and their corresponding grades
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-25s", students[i]); // Print student name aligned
            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("%-30d", grades[i][j]); // Print each grade aligned
            }
            System.out.println(); // New line for each student
        }
    }
}
