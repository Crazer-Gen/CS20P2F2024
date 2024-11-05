/*
Program: Num.java    Date: November 4, 2024
Purpose: The object that calculate the ones, tens and hundreds and shows the whole number

Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
*/
package Masters;

public class Num {
    private int number;

    // Constructor
    public Num(int number) {
        this.number = number;
    }

    // Method to get the whole number
    public int getNumber() {
        return number;
    }

    // Method to get the ones digit
    public int getOnesDigit() {
        return Math.abs(number % 10);
    }

    // Method to get the tens digit
    public int getTensDigit() {
        return Math.abs((number / 10) % 10);
    }

    // Method to get the hundreds digit
    public int getHundredsDigit() {
        return Math.abs((number / 100) % 10);
    }
}

