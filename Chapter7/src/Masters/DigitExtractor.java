/*
Program: DigitExtractor.java    Date: November 4, 2024
Purpose: Extract the ones, tens and hundreds digit of a number

Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
*/
package Masters;

import java.util.Scanner;
public class DigitExtractor {
    private static final char SHOW_NUMBER = 'W';
    private static final char SHOW_ONES = 'O';
    private static final char SHOW_TENS = 'T';
    private static final char SHOW_HUNDREDS = 'H';
    private static final char QUIT = 'Q';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();
        
        // Create a Num object
        Num num = new Num(inputNumber);
        
        char choice;
        do {
            // Display menu options
            System.out.println("Show (W)hole number");
            System.out.println("Show (O)nes place number");
            System.out.println("Show (T)ens place number");
            System.out.println("Show (H)undreds place number");
            System.out.println("(Q)uit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().toUpperCase().charAt(0);

            // Handle user choice
            switch (choice) {
                case SHOW_NUMBER:
                    System.out.println("Whole number: " + num.getNumber());
                    break;
                case SHOW_ONES:
                    System.out.println("Ones digit: " + num.getOnesDigit());
                    break;
                case SHOW_TENS:
                    System.out.println("Tens digit: " + num.getTensDigit());
                    break;
                case SHOW_HUNDREDS:
                    System.out.println("Hundreds digit: " + num.getHundredsDigit());
                    break;
                case QUIT:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                	System.out.println("Invalid choice. Please enter W, O, T, H, or Q.");

                    break;
            }
        } while (choice != QUIT);

        scanner.close();
    }
}

/* Screen Dump

Enter an integer: 123

Enter an integer: 123
Show (W)hole number
Show (O)nes place number
Show (T)ens place number
Show (H)undreds place number
(Q)uit
Enter your choice: w
Whole number: 123
Show (W)hole number
Show (O)nes place number
Show (T)ens place number
Show (H)undreds place number
(Q)uit
Enter your choice: o
Ones digit: 3
Show (W)hole number
Show (O)nes place number
Show (T)ens place number
Show (H)undreds place number
(Q)uit
Enter your choice: T
Tens digit: 2
Show (W)hole number
Show (O)nes place number
Show (T)ens place number
Show (H)undreds place number
(Q)uit
Enter your choice: h
Hundreds digit: 1
Show (W)hole number
Show (O)nes place number
Show (T)ens place number
Show (H)undreds place number
(Q)uit
Enter your choice: q
Exiting the application. Goodbye!

 */