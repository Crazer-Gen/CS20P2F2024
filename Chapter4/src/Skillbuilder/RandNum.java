package Skillbuilder;

import java.lang.Math;
import java.util.Scanner;

public class RandNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for minimum and maximum values
        System.out.print("Please enter the minimum value: ");
        int minVal = input.nextInt();

        System.out.print("Please enter the maximum value: ");
        int maxVal = input.nextInt();

        input.close();
        // Check if the minimum is less than the maximum
        if (minVal >= maxVal) {
            System.out.println("Error: Minimum value must be less than maximum value.");
        } else {
            // Display the random integer
            System.out.println("Random integer between " + minVal + " and " + maxVal + ": " + ((minVal-maxVal+1)* MathRandom()+minVal));
        }

    }
    
}

