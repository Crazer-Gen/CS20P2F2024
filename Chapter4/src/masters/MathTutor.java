package masters;

import java.util.Random;
import java.util.Scanner;

public class MathTutor {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Generate two random numbers between 1 and 10
        int num1 = random.nextInt(10) + 1; 
        int num2 = random.nextInt(10) + 1; 

        // Generate a random operator
        String[] operators = {"+", "-", "*", "/"};
        String operator = operators[random.nextInt(operators.length)];

        // Display the math problem
        System.out.print("Solve the following problem: " + num1 + " " + operator + " " + num2 + " = ");
        double userAnswer = input.nextDouble();
        double correctAnswer = 0;
        input.close();
        // Calculate the correct answer
        switch (operator) {
            case "+":
                correctAnswer = num1 + num2;
                break;
            case "-":
                correctAnswer = num1 - num2;
                break;
            case "*":
                correctAnswer = num1 * num2;
                break;
            case "/":
                correctAnswer = (double) num1 / num2; // Use double division for accuracy
                break;
        }

        // Check the user's answer
        if (Math.abs(userAnswer - correctAnswer) < 0.01) { // Allow for small floating point inaccuracies
            System.out.println("Correct!");
        } else {
            System.out.printf("Incorrect. The correct answer is %.2f.%n", correctAnswer);
        }


    }
}

