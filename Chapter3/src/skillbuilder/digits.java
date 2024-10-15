package skillbuilder;

import java.util.Scanner;

public class digits {

	public static void main(String[] args) {
		// declare variables
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a two digits number: ");
		int num = input.nextInt();
		
		int ones = num % 10;
		int tens = (num/10) % 10;
		System.out.println("tens: "+tens);
        System.out.println("ones: "+ones);
        input.close();
	}

}
