package masters;

import java.util.Scanner;

public class QuadraticEcuations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the variables
        System.out.println("Here we calculate for you any quadratic formula!");
        System.out.print("Enter a value for a: ");
        int a = input.nextInt();
        System.out.print("Enter a value for b: ");
        int b = input.nextInt();
        System.out.print("Enter a value for c: ");
        int c = input.nextInt();
        
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the nature of the roots
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The root is real and the same.");
            System.out.println("Root: " + root);
        } else {
            // No real roots
            System.out.println("The equation has no real roots.");
        }

        input.close();
    }
}


