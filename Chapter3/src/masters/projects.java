package masters;

import java.util.Scanner;

public class projects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		int designing, coding, debugging, testing;
		double totalMinutes, totalDesign, totalCode, totalDebug, totalTest;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your total minutes for:");
		System.out.print("Designing: ");
		designing = input.nextInt();
		System.out.print("Coding: ");
		coding = input.nextInt();
		System.out.print("Debugging: ");
		debugging = input.nextInt();
		System.out.print("Testing: ");
		testing = input.nextInt();
		input.close();

		totalMinutes = designing+coding+debugging+testing;
		totalDesign = ( designing / totalMinutes) * 100;
		totalCode = ( coding / totalMinutes) * 100;
		totalDebug = ( debugging / totalMinutes) * 100;
		totalTest = ( testing / totalMinutes) * 100;
		
		System.out.println("");
 
		
		System.out.format("%-10s %8s", "Task", "%Time\n");
		System.out.format("%-10s %9.2f%%%n", "Designing", totalDesign);
		System.out.format("%-10s %9.2f%%%n", "Coding", totalCode);
		System.out.format("%-10s %9.2f%%%n", "Debugging", totalDebug);
		System.out.format("%-10s %9.2f%%%n", "Testing",  totalTest);

	}

}
/*aqui tienes para el error log el como hiciste las operaciones
 * totalMinutes = designing+coding+debugging+testing;
totalDesign =  designing / totalMinutes;
totalCode =  coding / totalMinutes ;
totalDebug =  debugging / totalMinutes;
totalTest =  testing / totalMinutes;

tambien usamos el percentage format
		
		System.out.format("%-10s %8s", "Task", "%Time\n");
		System.out.format("%-10s %9.2f%%%n", "Designing", totalDesign);
		System.out.format("%-10s %9.2f%%%n", "Coding", totalCode);
		System.out.format("%-10s %9.2f%%%n", "Debugging", totalDebug);
		System.out.format("%-10s %9.2f%%%n", "Testing",  totalTest);
 */