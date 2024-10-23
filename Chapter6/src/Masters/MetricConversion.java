/*
Program: MetricConversion.java    Date: October 23, 2024

Purpose:Convert a certain amount of units to anoter units

Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
*/
package Masters;

import java.util.Scanner;
public class MetricConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
        // Get the value to convert
        System.out.print("Enter the value to convert: ");
        double value = input.nextDouble();
        // Display conversion options
        System.out.println("\nMetric Conversion Menu:");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Feet to Centimeters");
        System.out.println("3. Yards to Meters");
        System.out.println("4. Miles to Kilometers");
        System.out.println("5. Centimeters to Inches");
        System.out.println("6. Centimeters to Feet");
        System.out.println("7. Meters to Yards");
        System.out.println("8. Kilometers to Miles");
        System.out.print("Choose an option (1-8): ");
        
        int choice = input.nextInt();
        // Perform conversion based on user choice
        switch (choice) {
            case 1:
                System.out.println(value + " inches = " + inchesToCentimeters(value) + " centimeters");
                break;
            case 2:
                System.out.println(value + " feet = " + feetToCentimeters(value) + " centimeters");
                break;
            case 3:
                System.out.println(value + " yards = " + yardsToMeters(value) + " meters");
                break;
            case 4:
                System.out.println(value + " miles = " + milesToKilometers(value) + " kilometers");
                break;
            case 5:
                System.out.println(value + " centimeters = " + centimetersToInches(value) + " inches");
                break;
            case 6:
                System.out.println(value + " centimeters = " + centimetersToFeet(value) + " feet");
                break;
            case 7:
                System.out.println(value + " meters = " + metersToYards(value) + " yards");
                break;
            case 8:
                System.out.println(value + " kilometers = " + kilometersToMiles(value) + " miles");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }       
        input.close();
    }
    // Conversion methods
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double feetToCentimeters(double feet) {
        return feet * 30;
    }

    public static double yardsToMeters(double yards) {
        return yards * 0.91;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.6;
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static double centimetersToFeet(double centimeters) {
        return centimeters / 30;
    }

    public static double metersToYards(double meters) {
        return meters / 0.91;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.6;
    }
}
/* Screen Dump
 
Enter the value to convert: 100

Metric Conversion Menu:
1. Inches to Centimeters
2. Feet to Centimeters
3. Yards to Meters
4. Miles to Kilometers
5. Centimeters to Inches
6. Centimeters to Feet
7. Meters to Yards
8. Kilometers to Miles
Choose an option (1-8): 1
100.0 inches = 254.0 centimeters

Enter the value to convert: 32

Metric Conversion Menu:
1. Inches to Centimeters
2. Feet to Centimeters
3. Yards to Meters
4. Miles to Kilometers
5. Centimeters to Inches
6. Centimeters to Feet
7. Meters to Yards
8. Kilometers to Miles
Choose an option (1-8): 73
Invalid choice. Please try again.
 
 */
