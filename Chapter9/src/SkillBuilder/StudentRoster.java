package SkillBuilder;

import java.util.Scanner;
public class StudentRoster {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many students are in the class?: ");
		int Size = input.nextInt();
		input.nextLine();
		String[] Stu = new String[Size];
		for (int i = 0; i < Size; i++) {
			System.out.print("Whats the name of the student " +(i +1) + "?: ");
			Stu[i] = input.nextLine();
		}
		System.out.println("Student Roster");
		for (int i = 0; i < Size; i++) {
			System.out.println(Stu[i]);
		}
		input.close();
	}
}


