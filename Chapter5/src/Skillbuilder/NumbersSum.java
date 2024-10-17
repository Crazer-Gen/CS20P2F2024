package Skillbuilder;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Initialize sum variable
        int sum = 0;
        
        // Display numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            sum += i; // Add the current number to sum
        }
        
        // Display the sum
        System.out.println("Sum: " + sum);
        
        // Close the scanner
        input.close();
    }
}
