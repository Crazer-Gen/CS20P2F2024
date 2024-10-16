package Skillbuilder;

import java.util.Scanner;

public class PerfecSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Calculate the square root and truncate it
        int sqrt = (int) Math.sqrt(number);
        input.close();
        // Check if squaring the truncated result equals the original number
        if (sqrt * sqrt == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}
