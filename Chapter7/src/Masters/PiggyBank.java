/*
Program: PiggyBank.java    Date: October 31, 2024
Purpose: Piggy Bank that Handle and manage the coins

Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
*/
package Masters;

/**
 * PiggyBank class to manage coins.
 */
public class PiggyBank {
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;

    // Constructor
    public PiggyBank() {
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }

    // Method to add coins
    public void addCoins(int pennies, int nickels, int dimes, int quarters) {
        this.pennies += pennies;
        this.nickels += nickels;
        this.dimes += dimes;
        this.quarters += quarters;
    }

    // Method to remove coins
    public void removeCoins(int pennies, int nickels, int dimes, int quarters) {
        if (this.pennies >= pennies) this.pennies -= pennies;
        if (this.nickels >= nickels) this.nickels -= nickels;
        if (this.dimes >= dimes) this.dimes -= dimes;
        if (this.quarters >= quarters) this.quarters -= quarters;
    }

    // Method to get total amount
    public double getTotalAmount() {
        return pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
    }

    // Method to display current coins
    public void displayCoins() {
        System.out.println("Current coins in the piggy bank:");
        System.out.println("Pennies: " + pennies);
        System.out.println("Nickels: " + nickels);
        System.out.println("Dimes: " + dimes);
        System.out.println("Quarters: " + quarters);
        System.out.printf("Total Amount: $%.2f\n", getTotalAmount());
    }
}

