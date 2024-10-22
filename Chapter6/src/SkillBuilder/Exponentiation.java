package SkillBuilder;

import java.util.Scanner;
public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for two numbers
        System.out.print("Enter the base number: ");
        double base = input.nextDouble();      
        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();
        // Calculate the result using the powerOf method
        double result = powerOf(base, exponent);
        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        input.close();
    }
    // Method to calculate base raised to the power of exponent
    public static double powerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

