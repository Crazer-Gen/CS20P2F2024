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

/* Screen Dump

Here we calculate for you any quadratic formula!
Enter a value for a: 2
Enter a value for b: -5
Enter a value for c: 9
The equation has no real roots.

Here we calculate for you any quadratic formula!
Enter a value for a: 1
Enter a value for b: 9
Enter a value for c: 3
The roots are real and different.
Root 1: -0.34668806854096257
Root 2: -8.653311931459037

Here we calculate for you any quadratic formula!
Enter a value for a: 3
Enter a value for b: 6
Enter a value for c: 3
The root is real and the same.
Root: -1.0

 
 */
