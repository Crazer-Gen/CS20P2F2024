/*
Program: AddCoins.java    Date: October 24, 2024
Purpose: Add the total value of the coins prompted for the user and display the amount in dollars
Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
*/
package Masters;

import java.util.Scanner;
public class AddCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        // Prompt user for the number of coins
        System.out.print("Enter your total coins: ");
        System.out.println("");
        System.out.print("Pennies: ");
        int pennies = input.nextInt();
        
        System.out.print("Nickels: ");
        int nickels = input.nextInt();
        
        System.out.print("Dimes: ");
        int dimes = input.nextInt();
        
        System.out.print("Quarters: ");
        int quarters = input.nextInt();
        System.out.println("");
        // Calculate and display total dollar amount
        String totalAmount = getDollarAmount(pennies, nickels, dimes, quarters);
        System.out.println("Total dollar amount: " + totalAmount);
        
        input.close(); // Close the scanner
    }
    // Method to calculate total dollar amount
    static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
        // Calculate total cents
        int totalCents = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);       
        // Convert total cents to dollars
        double dollars = totalCents / 100.0;        
        // Return formatted dollar amount with currency sign
        return String.format("$%.2f", dollars);
    }
}
/* Screen Dump

Enter your total coins: 
Pennies: 1
Nickels: 2
Dimes: 4
Quarters: 8

Total dollar amount: $2.51
 
 */