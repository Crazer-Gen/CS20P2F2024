/*
Program: EvensAndOdds.java    Date: November 28, 2024
Purpose: Generate 25 random numbers and sort them in two lists, odds and evens

Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
*/
package Masters;

import java.util.Random;
public class EvensAndOdds {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] evens = new int[25];  // Array to store even numbers
        int[] odds = new int[25];   // Array to store odd numbers
        
        int evenCount = 0;  // Counter for even numbers
        int oddCount = 0;   // Counter for odd numbers

        // Generate 25 random numbers and classify them as even or odd
        for (int i = 0; i < 25; i++) {
            int nuevo = random.nextInt(100);  // Generate random number between 0 and 99
            
            if (nuevo % 2 == 0) {  // If the number is even
                evens[evenCount] = nuevo;  // Store in the evens array
                evenCount++;  // Increment the even counter
            } else {  // If the number is odd
                odds[oddCount] = nuevo;  // Store in the odds array
                oddCount++;  // Increment the odd counter
            }
        }
        
        // Print all even numbers on one line
        System.out.println("Evens: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evens[i] + " ");
        }
        
        // Print all odd numbers on the next line
        System.out.println("\nOdds: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odds[i] + " ");
        }
    }
}
/* Screen Dump

Evens: 
50 52 34 12 66 12 22 14 
Odds: 
51 43 83 17 19 59 95 53 75 23 17 47 95 59 43 71 29 
 
 */