package masters;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNum = random.nextInt(20) + 1; // generate a random number
        System.out.print("Enter a number between 1 and 20: "); // prompt the user for a number between 1 to 20
        int userNum = input.nextInt();
        
        // display both numbers
        System.out.printf("Computer's number: %d\n", secretNum);
        System.out.printf("Player's number: %d\n", userNum);
        
        // compare both numbers
        if (userNum == secretNum) {
            // won message
            System.out.println("You won!");
        } else {
            // lose message
            System.out.println("Better luck next time");
        }
        input.close();
    }
}
/* Screen Dump

Enter a number between 1 and 20: 4
Computer's number: 10
Player's number: 4
Better luck next time

Enter a number between 1 and 20: 12
Computer's number: 12
Player's number: 12
You won!
 
 */