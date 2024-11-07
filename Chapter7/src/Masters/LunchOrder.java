/*
Program: LunchOrder.java    Date: November 5, 2024
Purpose: Prompt the user for the amount of food (Hamburguers, Fries, Salads, and Sodas) and display the Total

Author: Cesar Pena, 
School: CHHS
Course: Computer Programming 20
*/
package Masters;

import java.util.Scanner;

public class LunchOrder {

    public static void main(String[] args) {
        // Create Food objects for each menu item
        Food hamburger = new Food(1.85, 9, 33, 1, "Delicious 100% Angus beef hamburger with cheese and toasted bun.");
        Food salad = new Food(2.00, 1, 11, 5, "Fresh salad with lettuce, tomato, carrot, and healthy dressing.");
        Food fries = new Food(1.30, 11, 36, 4, "Crispy French fries, the perfect side for your meal.");
        Food soda = new Food(0.95, 0, 38, 0, "Refreshing soda with a cola flavor.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our restaurant! We are ready to take your order.");      
        // Ask the user for the number of each product
        int numHamburgers = getUserInput(scanner, "hamburgers");
        displayNutrition("Hamburger", hamburger, numHamburgers);

        int numSalads = getUserInput(scanner, "salads");
        displayNutrition("Salad", salad, numSalads);

        int numFries = getUserInput(scanner, "French fries");
        displayNutrition("French Fries", fries, numFries);

        int numSodas = getUserInput(scanner, "sodas");
        displayNutrition("Soda", soda, numSodas);

        // Calculate the total cost
        double totalPrice = (numHamburgers * hamburger.getPrice()) +
                            (numSalads * salad.getPrice()) +
                            (numFries * fries.getPrice()) +
                            (numSodas * soda.getPrice());

        // Order summary
        System.out.println("\nYour order summary:");
        System.out.printf("%d Hamburgers\n", numHamburgers);
        System.out.printf("%d Salads\n", numSalads);
        System.out.printf("%d French Fries\n", numFries);
        System.out.printf("%d Sodas\n", numSodas);

        // Display the total cost
        System.out.printf("\nThe total cost of your order is: $%.2f\n", totalPrice);

        // Thank the customer
        System.out.println("\nThank you for your order! We hope you enjoy your meal.");

        scanner.close();
    }

    // A reausable method to ask the user for the number of each item
    public static int getUserInput(Scanner scanner, String item) {
        System.out.print("How many " + item + " would you like?: ");
        return scanner.nextInt();
    }

    // Helper method to display the nutritional information of an item
    public static void displayNutrition(String itemName, Food food, int quantity) {
        int totalFat = food.getFat() * quantity;
        int totalCarbs = food.getCarbohydrates() * quantity;
        int totalFiber = food.getFiber() * quantity;

        // Show description and total nutrition
        System.out.printf("\nDescription of %s:\n%s\n", itemName, food.getDescription());
        System.out.printf("%s (for %d units):\n", itemName, quantity);
        System.out.printf("Fat: %dg, Carbohydrates: %dg, Fiber: %dg\n\n", totalFat, totalCarbs, totalFiber);
    }
}

// Food class to store the information of each item
class Food {
    private double price;
    private int fat;          
    private int carbohydrates; 
    private int fiber;       
    private String description;

    // Constructor
    public Food(double price, int fat, int carbohydrates, int fiber, String description) {
        this.price = price;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
        this.description = description;
    }

    // Getter methods
    public double getPrice() {
        return price;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getFiber() {
        return fiber;
    }

    public String getDescription() {
        return description;
    }
}


/* Screen Dump

Welcome to our restaurant! We are ready to take your order.
How many hamburgers would you like? 1

Description of Hamburger:
Delicious 100% Angus beef hamburger with cheese and toasted bun.
Hamburger (for 1 units):
Fat: 9g, Carbohydrates: 33g, Fiber: 1g

How many salads would you like? 1

Description of Salad:
Fresh salad with lettuce, tomato, carrot, and healthy dressing.
Salad (for 1 units):
Fat: 1g, Carbohydrates: 11g, Fiber: 5g

How many French fries would you like? 1

Description of French Fries:
Crispy French fries, the perfect side for your meal.
French Fries (for 1 units):
Fat: 11g, Carbohydrates: 36g, Fiber: 4g

How many sodas would you like? 1

Description of Soda:
Refreshing soda with a cola flavor.
Soda (for 1 units):
Fat: 0g, Carbohydrates: 38g, Fiber: 0g


Your order summary:
1 Hamburgers
1 Salads
1 French Fries
1 Sodas

The total cost of your order is: $6.10

Thank you for your order! We hope you enjoy your meal.
 */
