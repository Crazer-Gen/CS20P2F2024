package skillbuilder;

import java.util.Scanner;


 public class gradeAverage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter your 1st grade: ");
		int num = scanner.nextInt();
		System.out.print("Enter your 2nd grade: ");
		num += scanner.nextInt();
		System.out.print("Enter your 3rd grade: ");
        num += scanner.nextInt();
		System.out.print("Enter your 4th grade: ");
        num += scanner.nextInt();
        System.out.print("Enter your 5th grade: ");
        num += scanner.nextInt();

        double avg = ((double)num)/5;
        System.out.print("your grade average is: "+avg);
        scanner.close();
	}

 }



