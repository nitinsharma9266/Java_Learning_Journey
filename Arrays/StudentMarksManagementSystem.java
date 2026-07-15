package Arrays;

import java.util.Scanner;

public class StudentMarksManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        System.out.printf("Enter marks of %d students:%n", n);

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // Display all marks
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();

        // Calculate total marks
        int totalMarks = 0;

        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }

        System.out.println("Total Marks: " + totalMarks);

        // Calculate average marks
        double averageMarks = (double) totalMarks / marks.length;

        System.out.println("Average Marks: " + averageMarks);

        // Find highest marks
        int highestMarks = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (highestMarks < marks[i]) {
                highestMarks = marks[i];
            }
        }

        System.out.println("Highest Marks: " + highestMarks);

        // Find lowest marks
        int lowestMarks = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (lowestMarks > marks[i]) {
                lowestMarks = marks[i];
            }
        }

        System.out.println("Lowest Marks: " + lowestMarks);

        // Count passed students
        int passedStudents = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 33) {
                passedStudents++;
            }
        }

        System.out.println("Passed Students: " + passedStudents);

        // First student marks
        System.out.println("First Student Marks: " + marks[0]);

        // Last student marks
        System.out.println("Last Student Marks: " + marks[marks.length - 1]);

        // Total students
        System.out.println("Total Students: " + marks.length);

        sc.close();
    }
}