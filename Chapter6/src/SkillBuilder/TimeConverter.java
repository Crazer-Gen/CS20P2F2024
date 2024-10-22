package SkillBuilder;

import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Time Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert hours to minutes");
        System.out.println("2. Convert days to hours");
        System.out.println("3. Convert hours to days");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter hours: ");
                double hoursToMinutes = input.nextDouble();
                double minutes = convertHoursToMinutes(hoursToMinutes);
                System.out.println(hoursToMinutes + " hours is " + minutes + " minutes.");
                break;
            case 2:
                System.out.print("Enter days: ");
                double daysToHours = input.nextDouble();
                double hours = convertDaysToHours(daysToHours);
                System.out.println(daysToHours + " days is " + hours + " hours.");
                break;
            case 3:
                System.out.print("Enter hours: ");
                double hoursToDays = input.nextDouble();
                double days = convertHoursToDays(hoursToDays);
                System.out.println(hoursToDays + " hours is " + days + " days.");
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
        input.close();
    }
    // Method to convert hours to minutes
    public static double convertHoursToMinutes(double hours) {
        return hours * 60;
    }
    // Method to convert days to hours
    public static double convertDaysToHours(double days) {
        return days * 24;
    }
    // Method to convert hours to days
    public static double convertHoursToDays(double hours) {
        return hours / 24;
    }
}
