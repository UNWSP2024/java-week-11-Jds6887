package harder1;

import java.util.Scanner;

public class GPACalculator {

    // Method to compute GPA
    static double computeGPA(double[] grades, double[] credits) {
        double totalGradePoints = 0;
        double totalCredits = 0;

        // Calculate total grade points and total credits
        for (int i = 0; i < grades.length; i++) {
            totalGradePoints += grades[i] * credits[i];
            totalCredits += credits[i];
        }

        // Check if there are no credits to avoid division by zero
        if (totalCredits == 0) {
            return 0; // or throw an exception based on your design choice
        }

        // Calculate GPA
        return totalGradePoints / totalCredits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of courses: ");
        int numCourses = scanner.nextInt();

        double[] grades = new double[numCourses];
        double[] credits = new double[numCourses];

        // Input grades and credits from user
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter grade for course " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            System.out.print("Enter credits for course " + (i + 1) + ": ");
            credits[i] = scanner.nextDouble();
        }

        // Compute GPA
        double gpa = computeGPA(grades, credits);
        
        // Print out the GPA
        System.out.printf("Your GPA is: %.2f%n", gpa);
        
        scanner.close();
    }
}