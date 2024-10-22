/*

Program: GuessingGame.java    Date: October 21, 2024

Purpose: generate a random number that the user should guess.

Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
 

*/

package Masters;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNum = random.nextInt(20) + 1; // generate a random number
        int userNum = 0; // initialize userNum
        int attempts = 0;

        System.out.println("Guess the number between 1 and 20!");

        while (userNum != secretNum) {
            System.out.print("Enter a number between 1 and 20: ");
            // Validate input
            if (input.hasNextInt()) {
                userNum = input.nextInt();

                if (userNum < 1 || userNum > 20) {
                    System.out.println("Please enter a number within the range.");
                    continue;
                }

                attempts++;
                
                // Compare both numbers
                if (userNum == secretNum) {
                    System.out.println("You won! It took you " + attempts + " attempts.");
                } else if (userNum < secretNum) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } else {
                System.out.println("That's not a valid number. Please enter a number between 1 and 20.");
                input.next(); // Clear the invalid input
            }
        }

        System.out.printf("Computer's number: %d\n", secretNum);
        input.close();
    }
}
/* Screen Dump

Guess the number between 1 and 20!
Enter a number between 1 and 20: 10
Too high! Try again.
Enter a number between 1 and 20: 5
Too low! Try again.
Enter a number between 1 and 20: 8
Too low! Try again.
Enter a number between 1 and 20: 9
You won! It took you 4 attempts.
Computer's number: 9
 
 */
