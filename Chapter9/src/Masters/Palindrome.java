/*
Program: Palindrome.java    Date: december 3, 2024
Purpose: check if a word is a palindrome or is not.

Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
*/
package Masters;
import java.util.Scanner;

public class Palindrome {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the string is the same forwards and backwards
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If any characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome!");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
/* Screen Dump

Enter a string to check if it's a palindrome: aguacate
The string is NOT a palindrome.

Enter a string to check if it's a palindrome: mom
The string is a palindrome!
 
 */