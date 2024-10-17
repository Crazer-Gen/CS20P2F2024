package Skillbuilder;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Initialize sum variable
        int sum = 0;
        
        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                sum += i; // Add odd number to sum
            }
        }
        
        // Display the sum of odd numbers
        System.out.println("Sum of odd numbers from 1 to " + number + ": " + sum);
        
        // Close the scanner
        input.close();
    }
}
