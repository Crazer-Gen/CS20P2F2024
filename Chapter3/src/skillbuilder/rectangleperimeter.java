package skillbuilder;

import java.util.Scanner;

public class rectangleperimeter {

	public static void main(String[] args) {
		
     
		int length, width, perimeter;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length: ");
		length = input.nextInt();
	    System.out.print("Enter the width: ");
	    width = input.nextInt();
	    input.close();
	    
	    perimeter = 2*length+2*width;
	    System.out.println("The perimeter of the rectangle is: " + perimeter );
	
	
	}

}


