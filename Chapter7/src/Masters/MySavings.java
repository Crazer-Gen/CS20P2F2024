/*
Program: MySavings.java    Date: November 1, 2024
Purpose: Displays a menu that let the user to Save money

Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
*/
package Masters;

import java.util.Scanner;
public class MySavings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PiggyBank piggyBank = new PiggyBank();
        int choice;
        //a do-while loop for the program
        do {
            System.out.println("\n--- MySavings Menu ---");
            System.out.println("1. Show total in bank and coin counts");
            System.out.println("2. Add a penny");
            System.out.println("3. Add a nickel");
            System.out.println("4. Add a dime");
            System.out.println("5. Add a quarter");
            System.out.println("6. Take money out of the bank");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-6): ");
            System.out.print("");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    piggyBank.displayCoins(); 
                    break;

                case 2:
                    System.out.print("Enter number of pennies to add: ");
                    int addPennies = scanner.nextInt();
                    piggyBank.addCoins(addPennies, 0, 0, 0);
                    System.out.println("Added " + addPennies + " penny(s).");
                    break;

                case 3:
                    System.out.print("Enter number of nickels to add: ");
                    int addNickels = scanner.nextInt();
                    piggyBank.addCoins(0, addNickels, 0, 0);
                    System.out.println("Added " + addNickels + " nickel(s).");
                    break;

                case 4:
                    System.out.print("Enter number of dimes to add: ");
                    int addDimes = scanner.nextInt();
                    piggyBank.addCoins(0, 0, addDimes, 0);
                    System.out.println("Added " + addDimes + " dime(s).");
                    break;

                case 5:
                    System.out.print("Enter number of quarters to add: ");
                    int addQuarters = scanner.nextInt();
                    piggyBank.addCoins(0, 0, 0, addQuarters);
                    System.out.println("Added " + addQuarters + " quarter(s).");
                    break;

                case 6:
                    System.out.print("Enter number of pennies to remove: ");
                    int removePennies = scanner.nextInt();
                    System.out.print("Enter number of nickels to remove: ");
                    int removeNickels = scanner.nextInt();
                    System.out.print("Enter number of dimes to remove: ");
                    int removeDimes = scanner.nextInt();
                    System.out.print("Enter number of quarters to remove: ");
                    int removeQuarters = scanner.nextInt();
                    piggyBank.removeCoins(removePennies, removeNickels, removeDimes, removeQuarters);
                    break;

                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 6.");//just in case
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }
}
/* Screen Dump (i will deeply show almost everything)

--- MySavings Menu ---
1. Show total in bank and coin counts
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
0. Exit
Enter your choice (0-6): 1
Current coins in the piggy bank:
Pennies: 0
Nickels: 0
Dimes: 0
Quarters: 0
Total Amount: $0.00

--- MySavings Menu ---
1. Show total in bank and coin counts
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
0. Exit
Enter your choice (0-6): 2
Enter number of pennies to add: 5
Added 5 penny(s).

--- MySavings Menu ---
1. Show total in bank and coin counts
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
0. Exit
Enter your choice (0-6): 5
Enter number of quarters to add: 2
Added 2 quarter(s).

--- MySavings Menu ---
1. Show total in bank and coin counts
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
0. Exit
Enter your choice (0-6): 1
Current coins in the piggy bank:
Pennies: 5
Nickels: 0
Dimes: 0
Quarters: 2
Total Amount: $0.55

--- MySavings Menu ---
1. Show total in bank and coin counts
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
0. Exit
Enter your choice (0-6): 6
Enter number of pennies to remove: 1
Enter number of nickels to remove: 1
Enter number of dimes to remove: 1
Enter number of quarters to remove: 1

--- MySavings Menu ---
1. Show total in bank and coin counts
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
0. Exit
Enter your choice (0-6): 1
Current coins in the piggy bank:
Pennies: 4
Nickels: 0
Dimes: 0
Quarters: 1
Total Amount: $0.29

--- MySavings Menu ---
1. Show total in bank and coin counts
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
0. Exit
Enter your choice (0-6): 0
Exiting the application. Goodbye!
 
 */