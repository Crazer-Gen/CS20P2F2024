/*

Program: GroupAssignement.java    Date: October 21, 2024

Purpose: Assign a group to the user depending on her/his name

Author: Cesar Pena,
School: CHHS
Course: Computer Programming 20
 

*/
package Masters;

import java.util.Scanner;
import java.lang.String;
public class GroupAssignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//prompt the user for his/her name
		System.out.print("Enter your first name: ");
		String FName = input.nextLine();
		System.out.print("Enter your last name: ");
		String LName = input.nextLine();
		input.close();
		//get the first letter of the user's last name
		int Go = LName.length();
		int DetLet = Go.substring(LName-1);
		//based on "flounln" determine the group for the user
		switch (Go) {
		case A
		}

	}

}
