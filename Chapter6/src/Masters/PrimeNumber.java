/*
Program: PrimeNumber.java    Date: October 23, 2024

Purpose: check for the prime numbers between the range given by the user

Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
*/
package Masters;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();       
        // Ensure firstNum is less than secondNum
        if (firstNum > secondNum) {
            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }
        System.out.println("Prime numbers between " + firstNum + " and " + secondNum + ":");       
        // Find and display prime numbers in the range
        for (int i = firstNum; i <= secondNum; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }        
        input.close(); // Close the scanner
    }
    // Method to check if a number is prime
    static boolean isPrime(int n) {
        // Check if the number is less than 2
        if (n < 2) return false;
        // Check if it is even
        if (n > 2 && n % 2 == 0) return false;
        // Check odd numbers only
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true; // n is prime
    }
}

