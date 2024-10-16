package Skillbuilder;
import java.util.Scanner;

public class Delivery {
	
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);

	   // Prompt user for the dimensions of the package
	   System.out.print("Enter the length of the package: ");
	   double length = input.nextDouble();

	   System.out.print("Enter the width of the package: ");
	   double width = input.nextDouble();

	   System.out.print("Enter the height of the package: ");
	   double height = input.nextDouble();
       input.close();
	    // Check if any dimension is greater than 10
	    if (length > 10 || width > 10 || height > 10) {
	            System.out.println("Reject");
	    } else {
	            System.out.println("Accept");
	    }
   }
	
}
