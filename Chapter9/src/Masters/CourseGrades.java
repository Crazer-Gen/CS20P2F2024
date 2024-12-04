package Masters;

import java.util.Scanner;

public class CourseGrades {

    public static void main(String[] args) {
        // Create a GradeBook object
        GradeBook gradebook = new GradeBook();
        
        // Get the grades from the user
        gradebook.getGrades();
        
        // Display the grades
        gradebook.showGrades();
        
        // Calculate and display the average grade of a specific student
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter student number (1-12) to calculate their average: ");
        int studentNum = scanner.nextInt();
        double studentAverage = gradebook.studentAvg(studentNum);
        if (studentAverage != -1) {
            System.out.printf("Student %d's average grade: %.2f\n", studentNum, studentAverage);
        }
        
        // Calculate and display the average grade of a specific test
        System.out.print("\nEnter test number (1-5) to calculate its average: ");
        int testNum = scanner.nextInt();
        double testAverage = gradebook.testAvg(testNum);
        if (testAverage != -1) {
            System.out.printf("Test %d's average grade: %.2f\n", testNum, testAverage);
        }
        
        scanner.close();
    }
}

class GradeBook {
    // 2D array to hold the grades for 12 students and 5 tests
    private int[][] grades = new int[12][5];
    
    // Method to prompt the user for the grades
    public void getGrades() {
        Scanner scanner = new Scanner(System.in);
        
        for (int student = 0; student < 12; student++) {
            System.out.println("Enter grades for Student " + (student + 1) + ":");
            for (int test = 0; test < 5; test++) {
                while (true) {
                    System.out.print("Test " + (test + 1) + ": ");
                    int grade = scanner.nextInt();
                    if (grade >= 0 && grade <= 100) {
                        grades[student][test] = grade;
                        break;
                    } else {
                        System.out.println("Invalid input. Grade must be between 0 and 100.");
                    }
                }
            }
        }
    }
    
    // Method to display all grades
    public void showGrades() {
        System.out.println("\nGrades for all students:");
        for (int student = 0; student < 12; student++) {
            System.out.print("Student " + (student + 1) + ": ");
            for (int test = 0; test < 5; test++) {
                System.out.print(grades[student][test] + " ");
            }
            System.out.println();
        }
    }
    
    // Method to calculate the average grade of a student
    public double studentAvg(int studentNum) {
        if (studentNum < 1 || studentNum > 12) {
            System.out.println("Invalid student number. Please enter a number between 1 and 12.");
            return -1;
        }
        studentNum--; // Convert to 0-based index
        int total = 0;
        for (int test = 0; test < 5; test++) {
            total += grades[studentNum][test];
        }
        return total / 5.0;
    }
    
    // Method to calculate the average grade of a test
    public double testAvg(int testNum) {
        if (testNum < 1 || testNum > 5) {
            System.out.println("Invalid test number. Please enter a number between 1 and 5.");
            return -1;
        }
        testNum--; // Convert to 0-based index
        int total = 0;
        for (int student = 0; student < 12; student++) {
            total += grades[student][testNum];
        }
        return total / 12.0;
    }
}
